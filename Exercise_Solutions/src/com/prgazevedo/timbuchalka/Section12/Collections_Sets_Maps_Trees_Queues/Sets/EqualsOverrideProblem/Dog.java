package com.prgazevedo.timbuchalka.Section12.Collections_Sets_Maps_Trees_Queues.Sets.EqualsOverrideProblem;

public class Dog {
    private final String dogName;

    public Dog(String dogName) {
        this.dogName = dogName;
    }

    public String getDogName() {
        return dogName;
    }

    @Override
    public final boolean equals(Object obj) {
        if(obj==this)return true;

        if(obj instanceof Dog){
            return this.dogName.equals(((Dog)obj).getDogName());
        }
        return false;

    }
}
