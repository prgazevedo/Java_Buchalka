package com.prgazevedo.timbuchalka.Section12.Collections_Sets_Maps_Trees_Queues.Maps.Adventure;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String,Integer> exitsMap;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exitsMap = new HashMap<String, Integer>();
    }

    public void addExit(String direction, int location){
        exitsMap.put(direction,location);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String,Integer>(exitsMap);
    }
}
