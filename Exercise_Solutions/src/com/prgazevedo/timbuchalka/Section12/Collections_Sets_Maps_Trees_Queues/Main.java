package com.prgazevedo.timbuchalka.Section12.Collections_Sets_Maps_Trees_Queues;


import com.prgazevedo.timbuchalka.Section11.Packages_Scope_Initializers.MyWindow;
import com.prgazevedo.timbuchalka.Section11.Packages_Scope_Initializers.ScopeCheck;
import com.prgazevedo.timbuchalka.Section11.Packages_Scope_Initializers.StaticInitializationBlocks;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        testTheatre();
    }

    private static void testTheatre() {
        Theatre theatre = new Theatre("Maxime",10,10);
        theatre.reserveSeat("A5");
        theatre.reserveSeat("A6");
        //theatre.printSeatList(theatre.getSeatList());

        System.out.println("Make shallow copy");
        List<Theatre.Seat> shallowCopy = theatre.makeShallowCopy();
        System.out.println("Reserve on main seat list (Theatre)");
        theatre.reserveSeat("A7");
        System.out.println("Print seat list");
        theatre.prettyPrintSeatList(theatre.getSeatList());
//        System.out.println("Print seat list shallow copy");
//        theatre.prettyPrintSeatList(shallowCopy);
//        System.out.println("We can reverse the main seat list");
//        theatre.prettyPrintSeatList(theatre.reverseSeatList());
//        System.out.println("Or we can shuffle the main seat list");
//        theatre.prettyPrintSeatList(theatre.shuffleSeatList());
//        System.out.println("But the reservations are the same");
//        theatre.prettyPrintSeatList(shallowCopy);
        System.out.println("Print seat list sorted by price");
        theatre.prettyPrintSeatList(theatre.sortSeatListByPrice());


    }


}
