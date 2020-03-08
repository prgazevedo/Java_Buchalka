package com.prgazevedo.timbuchalka.Section12.Collections_Sets_Maps_Trees_Queues.Sets;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satelliteSet;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        satelliteSet = new HashSet<>();
    }

    public boolean addMoon(HeavenlyBody moon){
       return this.satelliteSet.add(moon);
    }

    public Set<HeavenlyBody> getSatelliteSet() {
        return new HashSet<>(satelliteSet);
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    //We have to redefine the equals and hashcode to avoid collisions in the Set or HashSet/HashMap
    //Always Use @Override to make the compiler check you are overriding the equals method
    // and not overloading (creating another same name method but different signature)
    //@link https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html
    @Override
    public boolean equals(Object obj){
        //if it has the same reference (compare with itself) then immediately return true;
        if(this==obj) return true;
        System.out.println("obj.getClass is"+obj.getClass());
        System.out.println("this.getClass is"+this.getClass());

        //To make sure both the obj is null and that no subclass is calling this equals
        //In this case it is unecessary because the class is declared final
        if((obj == null) ||  obj.getClass()!=this.getClass()) return false;

        //This is the actual equals verification
        String objName = ((HeavenlyBody)obj).getName();
        return this.name.equals(objName);
    }

    @Override
    //we add a number to the String name hashCode. This is because for example:
    //a String "Pluto" should have a different hashcode than a Heavenly body: Pluto
    public int hashCode() {
        System.out.println("hashCode called");
        return this.name.hashCode()+47;
    }
}
