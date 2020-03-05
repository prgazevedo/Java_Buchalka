package com.prgazevedo.timbuchalka.Section11.Packages_Scope_Initializers;

public class StaticInitializationBlocks {
    public static final String owner;

    static {

        owner = "I Own Myself";
        System.out.println("SIB#1 was called. Owner is: "+owner);
    }

    public StaticInitializationBlocks() {
        System.out.println("Ctor was called");
    }

    static {
        System.out.println("SIB#2 was called");
        printOwner();
    }

    public static void printOwner(){
        System.out.println("Owner is: "+owner);
    }
}
