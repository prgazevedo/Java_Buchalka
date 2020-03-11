package com.prgazevedo.timbuchalka.Section12.Collections_Sets_Maps_Trees_Queues.Sets.EqualsOverrideProblem;

public class Labrador extends Dog {
    public Labrador(String dogName) {
        super(dogName);
    }

/**
 *Notice that override does not compile because
 *Dog equals was made final so that subclasses cannot
 *override and mess up the equals
 */
//    @Override
//    public boolean equals(Object obj){
//        if(obj==this)return true;
//
//        if(obj instanceof Labrador){
//            return this.getDogName().equals(((Labrador)obj).getDogName());
//        }
//        return false;
//    }

}
