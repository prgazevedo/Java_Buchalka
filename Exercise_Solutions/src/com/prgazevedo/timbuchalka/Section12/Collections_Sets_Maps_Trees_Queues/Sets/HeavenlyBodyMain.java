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

public class HeavenlyBodyMain {

    private static Map<HeavenlyBody.Key,HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> heavenlyBodies = new HashSet<>();


    public static void main(String[] args) {
        HeavenlyBody tempStar = new Star("Sol", HeavenlyBody.Bodytype.STAR,0);
        solarSystem.put(tempStar.getKey(),tempStar);
        heavenlyBodies.add(tempStar);

        HeavenlyBody temp = new Planet("Mercury", HeavenlyBody.Bodytype.PLANET,88);
        solarSystem.put(temp.getKey(),temp);
        heavenlyBodies.add(temp);
        tempStar.addSatellite(temp);

         temp = new Planet("Venus",HeavenlyBody.Bodytype.PLANET,255);
        solarSystem.put(temp.getKey(),temp);
        heavenlyBodies.add(temp);
        tempStar.addSatellite(temp);

         temp = new Planet("Earth",HeavenlyBody.Bodytype.PLANET,365);
        solarSystem.put(temp.getKey(),temp);
        heavenlyBodies.add(temp);
        tempStar.addSatellite(temp);

        HeavenlyBody tempMoon = new Satellite("Moon", HeavenlyBody.Bodytype.MOON, 27);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Mars",HeavenlyBody.Bodytype.PLANET, 687);
        solarSystem.put(temp.getKey(), temp);
        heavenlyBodies.add(temp);
        tempStar.addSatellite(temp);

        tempMoon = new Satellite("Deimos", HeavenlyBody.Bodytype.MOON, 1.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Mars

        tempMoon = new Satellite("Phobos", HeavenlyBody.Bodytype.MOON, 0.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Mars

        temp = new Planet("Jupiter", HeavenlyBody.Bodytype.PLANET,4332);
        solarSystem.put(temp.getKey(), temp);
        heavenlyBodies.add(temp);
        tempStar.addSatellite(temp);

        tempMoon = new Satellite("Io", HeavenlyBody.Bodytype.MOON, 1.8);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Satellite("Europa",  HeavenlyBody.Bodytype.MOON,3.5);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Satellite("Ganymede",  HeavenlyBody.Bodytype.MOON,7.1);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Satellite("Callisto",  HeavenlyBody.Bodytype.MOON,16.7);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        temp = new Planet("Saturn",HeavenlyBody.Bodytype.PLANET, 10759);
        solarSystem.put(temp.getKey(), temp);
        heavenlyBodies.add(temp);
        tempStar.addSatellite(temp);

        temp = new Planet("Uranus",HeavenlyBody.Bodytype.PLANET, 30660);
        solarSystem.put(temp.getKey(), temp);
        heavenlyBodies.add(temp);
        tempStar.addSatellite(temp);

        temp = new Planet("Neptune",HeavenlyBody.Bodytype.PLANET, 165);
        solarSystem.put(temp.getKey(), temp);
        heavenlyBodies.add(temp);
        tempStar.addSatellite(temp);

        temp = new Planet("Pluto", HeavenlyBody.Bodytype.PLANET,248);
        solarSystem.put(temp.getKey(), temp);
        heavenlyBodies.add(temp);
        tempStar.addSatellite(temp);

        System.out.println("========================================================");
        System.out.println("The Solar System Map key set");
        for (HeavenlyBody.Key k:solarSystem.keySet()){
            System.out.println(k.toString());
        }
        System.out.println("========================================================");
        System.out.println("The Solar System Map values collection");
        for (HeavenlyBody v:solarSystem.values()){
            System.out.println(v.toString());
        }
        System.out.println("========================================================");
        System.out.println("The Solar System Set");
        for (HeavenlyBody body:heavenlyBodies) {
            System.out.println(body.toString());
            for (HeavenlyBody satellite : body.getSatelliteSet()) {
                System.out.println("\t"+satellite.toString());
            }

        }
        System.out.println("========================================================");
        System.out.println("Check the makeKey");
        System.out.println("The planet Pluto has orbital period: "+solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.Bodytype.PLANET)).getOrbitalPeriod());
        System.out.println("========================================================");
        System.out.println("Check the symmetry in equals");
        HeavenlyBody earth1 = new Planet("Earth1", HeavenlyBody.Bodytype.PLANET,300);
        HeavenlyBody earth2 = new Planet("Earth1", HeavenlyBody.Bodytype.PLANET,300);
        System.out.println("Earth1 equals Earth2:"+earth1.equals(earth2));
        System.out.println("Earth2 equals Earth1:"+earth2.equals(earth1));

//        System.out.println("All Planets, moons and their orbital periods");
//        for (HeavenlyBody planet:planets) {
//            System.out.println("\t"+planet.getKey()+" has orbital period: "+ planet.getOrbitalPeriod());
//            for(HeavenlyBody moon:planet.getSatelliteSet()){
//                System.out.println("\t\t"+moon.getKey()+" has orbital period: "+moon.getOrbitalPeriod());
//            }
//        }

//        //create a new set only of moons
//        Set<HeavenlyBody> allMoons = new HashSet<>();
//        for(HeavenlyBody planet:planets){
//           allMoons.addAll(planet.getSatelliteSet());
//        }
//
//        System.out.println("All moons");
//        for(HeavenlyBody moon:allMoons){
//            System.out.println("\t"+moon.getKey());
//        }
//
//        System.out.println("Test the problem with hashcode/equals and the set");
//        System.out.println("Create new duplicate pluto object");
//        temp = new Planet("Pluto", HeavenlyBody.Bodytype.PLANET, 1);
//        solarSystem.put(temp.getKey(), temp);
//        planets.add(temp);
//        for (HeavenlyBody planet:planets) {
//            System.out.println("\t"+planet.getKey()+" has orbital period: "+ planet.getOrbitalPeriod());
//        }



    }
}
