package com.prgazevedo.timbuchalka.Section12.Collections_Sets_Maps_Trees_Queues.Sets;

public class Star extends HeavenlyBody {

    public Star(String name, Bodytype type, double orbitalPeriod) {
        super(name, type, orbitalPeriod);
    }

    @Override
    public boolean addSatellite(HeavenlyBody satellite) {
        if(satellite instanceof Planet && satellite.getKey().getBodytype()==Bodytype.PLANET){
            return this.satelliteSet.add(satellite);
        } else {
            System.out.println("This is not a planet");
        }
        return false;
    }
}
