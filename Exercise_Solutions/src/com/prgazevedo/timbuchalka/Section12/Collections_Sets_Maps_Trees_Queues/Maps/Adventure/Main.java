package com.prgazevedo.timbuchalka.Section12.Collections_Sets_Maps_Trees_Queues.Maps.Adventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//The adventure Map


//Map of Adventure           ___________
//                          |           |
//          --------------> |  5.Forest |
//          |               |___________|
//          |                     ^
//          |                     |
//     _____v_____           _____v_____             ___________
//    |           |         |           |           |           |
//    |  2.Hill   |<--------|  1.Road   |<--------->|3.Building |
//    |___________|         |___________|           |___________|
//          ^                      ^
//          |                      |
//          |                 _____v_____
//          |----------------|           |
//                           | 4.Valley  |
//                           |___________|

public class Main {
    private static Map<Integer,Location> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExit("N",5);
        locations.get(1).addExit("S",4);
        locations.get(1).addExit("E",3);
        locations.get(1).addExit("W",2);
        locations.get(1).addExit("Q",0);

        locations.get(2).addExit("N",5);
        locations.get(2).addExit("Q",0);

        locations.get(3).addExit("W",1);
        locations.get(3).addExit("Q",0);

        locations.get(4).addExit("N",1);
        locations.get(4).addExit("W",2);
        locations.get(4).addExit("Q",0);

        locations.get(5).addExit("S",1);
        locations.get(5).addExit("W",2);
        locations.get(5).addExit("Q",0);

        int selectedLocation=1;
        while(true){
            System.out.println(locations.get(selectedLocation).getDescription());
            if(selectedLocation==0) break;

            Map<String, Integer> exits= locations.get(selectedLocation).getExits();
            System.out.print("Exits are: ");
            for (String s:exits.keySet())
            {
                System.out.print(s+",");
            }

            System.out.println("Choose an exit:");
            String choice = scanner.nextLine();
            if(exits.containsKey(choice))
            {
                selectedLocation=  exits.get(choice);
                System.out.println("You choose: "+choice);

            } else{
                System.out.println("Not a valid exit");
            }
        }

    }
}