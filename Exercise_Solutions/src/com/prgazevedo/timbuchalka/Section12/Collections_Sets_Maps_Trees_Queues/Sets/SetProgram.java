package com.prgazevedo.timbuchalka.Section12.Collections_Sets_Maps_Trees_Queues.Sets;

//////////////////////////////////////////////////////
//Sets have no order but there are not duplicates
//Set is generic and takes a single type
//Set provides add, remove and clear, plus contain
//Set does not provide a get and only an iterator
//HashSet is the best performing implementation of a Set
//HashSet uses a hash to store the items and a dummy value is stored

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetProgram {

    private static Map<String,HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();


    public static void main(String[] args) {
        HeavenlyBody temp = new HeavenlyBody("Mercury",88);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

         temp = new HeavenlyBody("Venus",255);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

         temp = new HeavenlyBody("Earth",365);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Mars", 687);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Deimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        tempMoon = new HeavenlyBody("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        temp = new HeavenlyBody("Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Io", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Europa", 3.5);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Ganymede", 7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Callisto", 16.7);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        temp = new HeavenlyBody("Saturn", 10759);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Uranus", 30660);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Neptune", 165);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Pluto", 248);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        System.out.println("All Planets, moons and their orbital periods");
        for (HeavenlyBody planet:planets) {
            System.out.println("\t"+planet.getName()+" has orbital period: "+ planet.getOrbitalPeriod());
            for(HeavenlyBody moon:planet.getSatelliteSet()){
                System.out.println("\t\t"+moon.getName()+" has orbital period: "+moon.getOrbitalPeriod());
            }
        }

        //create a new set only of moons
        Set<HeavenlyBody> allMoons = new HashSet<>();
        for(HeavenlyBody planet:planets){
           allMoons.addAll(planet.getSatelliteSet());
        }

        System.out.println("All moons");
        for(HeavenlyBody moon:allMoons){
            System.out.println("\t"+moon.getName());
        }

        System.out.println("Test the problem with hashcode/equals and the set");
        System.out.println("Create new duplicate pluto object");
        temp = new HeavenlyBody("Pluto", 1);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        for (HeavenlyBody planet:planets) {
            System.out.println("\t"+planet.getName()+" has orbital period: "+ planet.getOrbitalPeriod());
        }



    }
}
