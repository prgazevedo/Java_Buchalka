package com.prgazevedo.timbuchalka.Section12.Collections_Sets_Maps_Trees_Queues.Sets;

public class Planet extends HeavenlyBody {
    public Planet(String name, Bodytype type, double orbitalPeriod) {
        super(name, type, orbitalPeriod);
    }

    @Override
    public boolean addSatellite(HeavenlyBody satellite) {
        if(satellite instanceof Satellite && satellite.getKey().getBodytype()==Bodytype.MOON){
            return this.satelliteSet.add(satellite);
        } else {
            System.out.println("This is not a moon");
        }
        return false;
    }
}
