package com.prgazevedo.timbuchalka.Section12.Collections_Sets_Maps_Trees_Queues;


import com.prgazevedo.timbuchalka.Section11.Packages_Scope_Initializers.MyWindow;
import com.prgazevedo.timbuchalka.Section11.Packages_Scope_Initializers.ScopeCheck;
import com.prgazevedo.timbuchalka.Section11.Packages_Scope_Initializers.StaticInitializationBlocks;

public class Main {


    public static void main(String[] args) {
        testTheatre();
    }

    private static void testTheatre() {
        Theatre theatre = new Theatre("Maxime",10,10);
        theatre.reserveSeat("A5");
        theatre.reserveSeat("A6");
        theatre.printReservations();


    }


}
