package com.prgazevedo.timbuchalka.Section12.Collections_Sets_Maps_Trees_Queues.Maps.Adventure;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Oracle instructions to make objects immutable:
//https://docs.oracle.com/javase/tutorial/essential/concurrency/imstrat.html

//Final keyword is technique#2 to make the class immutable
public final class Location {
    //Final and private keywords is also technique#2 to make the class immutable
    private final int locationID;
    private final String description;
    private final Map<String,Integer> exitsMap;


    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        //Technique#5 is to make inside copies of all outside data
        // Never store references to external, mutable objects passed to the constructor; if necessary, create copies, and store references to the copies
        this.exitsMap = new HashMap<>(exits);
        exitsMap.put("Q",0);
    }

    //Technique #4 is to disallow add exits and put in ctor the initializations
//    public void addExit(String direction, int location){
//        exitsMap.put(direction,location);
//    }

    //Technique#3 is to not provide setters
    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    //Technique #1 is to return copies of any internal member variables to disallow modification by external classes
    public Map<String, Integer> getExits() {
        return new HashMap<String,Integer>(exitsMap);
    }
}
