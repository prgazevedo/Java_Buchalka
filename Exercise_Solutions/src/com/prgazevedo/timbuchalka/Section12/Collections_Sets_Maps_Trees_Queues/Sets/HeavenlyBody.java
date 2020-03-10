package com.prgazevedo.timbuchalka.Section12.Collections_Sets_Maps_Trees_Queues.Sets;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HeavenlyBody {
//    private final String name;
//    private final Bodytype bodytype;
    private final double orbitalPeriod;
    protected final Set<HeavenlyBody> satelliteSet;

    public enum Bodytype {STAR,PLANET,MOON};
    private Key key;

    public HeavenlyBody(String name,Bodytype type, double orbitalPeriod) {
//        this.name = name;
//        this.bodytype = type;
        this.orbitalPeriod = orbitalPeriod;
        satelliteSet = new HashSet<>();

        key = new Key(name,type);
    }

    public boolean addSatellite(HeavenlyBody satellite){
            return this.satelliteSet.add(satellite);
    }

    public Set<HeavenlyBody> getSatelliteSet() {
        return new HashSet<>(satelliteSet);
    }

//
//    public String getName() {
//        return name;
//    }
//
//    public Bodytype getBodytype() {
//        return bodytype;
//    }

    public Key getKey() {
        return key;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    //We have to redefine the equals and hashcode to avoid collisions in the Set or HashSet/HashMap
    //Always Use @Override to make the compiler check you are overriding the equals method
    // and not overloading (creating another same name method but different signature)
    //@link https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html
    @Override
    public final boolean equals(Object obj){
        //if it has the same reference (compare with itself) then immediately return true;
        if(this==obj) return true;


        //To make sure both the obj is null and that no subclass is calling this equals
        //In this case it is unecessary because the class is declared final
//        System.out.println("obj.getClass is"+obj.getClass());
//        System.out.println("this.getClass is"+this.getClass());
//        if((obj == null) ||  obj.getClass()!=this.getClass()) return false;

        //This is the actual equals verification
        if(obj instanceof HeavenlyBody) {

            //We are now using a Key class ( make a unique identifier) to check equals  for a Heavenly Body
            return this.key.equals((((HeavenlyBody) obj).getKey()));

            //This is the alternative method of checking some member variables
//            String objName = ((HeavenlyBody) obj).getName();
//            if( this.name.equals(objName)){
//                return this.bodytype == ((HeavenlyBody) obj).getBodytype();
            }

        return false;
    }

    @Override
    //we add a number to the String name hashCode. This is because for example:
    //a String "Pluto" should have a different hashcode than a Heavenly body: Pluto
    public final int hashCode() {
//        System.out.println("hashCode called");
        return this.key.name.hashCode()+47+this.key.bodytype.hashCode();
    }

    @Override
    public String toString() {
        return "name='" + this.key.name + '\'' + ", orbitalPeriod=" + orbitalPeriod + ", bodytype=" + this.key.bodytype;
    }

    //Used to make lookups in the map
    public static Key makeKey(String name, Bodytype bodytype){
        return new Key(name,bodytype);
    }

    public static final class Key{
        private String name;
        private HeavenlyBody.Bodytype bodytype;

        public Key(String name, HeavenlyBody.Bodytype bodytype) {
            this.name = name;
            this.bodytype = bodytype;
        }

        public String getName() {
            return name;
        }

        public HeavenlyBody.Bodytype getBodytype() {
            return bodytype;
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key)obj;
            if(this.name.equals(((Key) obj).getName())){
                if(this.bodytype.equals(((Key) obj).getBodytype())){
                    return true;
                }
            }
            return false;

        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 47 + this.bodytype.hashCode();
        }

        @Override
        public String toString() {
            return "name='" + name + '\'' + ", bodytype=" + bodytype ;
        }
    }

}
