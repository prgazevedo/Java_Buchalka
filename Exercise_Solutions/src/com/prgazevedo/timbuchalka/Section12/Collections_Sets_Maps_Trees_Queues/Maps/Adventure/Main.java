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
        Map<String, Integer> exits = new HashMap<>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",exits));
        exits = new HashMap<>();
        exits.put("N",5);
        exits.put("S",4);
        exits.put("E",3);
        exits.put("W",2);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",exits));
        exits = new HashMap<>();
        exits.put("N",5);
        locations.put(2, new Location(2, "You are at the top of a hill",exits));
        exits = new HashMap<>();
        exits.put("W",1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",exits));
        exits = new HashMap<>();
        exits.put("N",1);
        exits.put("W",2);
        locations.put(4, new Location(4, "You are in a valley beside a stream",exits));
        exits = new HashMap<>();
        exits.put("S",1);
        exits.put("W",2);
        locations.put(5, new Location(5, "You are in the forest",exits));


        int selectedLocation=1;
        while(true){
            System.out.println(locations.get(selectedLocation).getDescription());
            if(selectedLocation==0) break;

            exits= locations.get(selectedLocation).getExits();
            System.out.print("Exits are: ");
            for (String s:exits.keySet())
            {
                System.out.print(s+",");
            }
            System.out.println();
            System.out.println("Choose an exit:");
            String choice = scanner.nextLine().toUpperCase();
            String[] splitCommands=choice.split("");
            choice = "";
            for (String s:splitCommands){
                if(Commands.getValidCommands().contains(s)){
                    choice=Commands.getExit(s);
                }
            }
            if(exits.containsKey(choice))
            {
                selectedLocation=  exits.get(choice);

            } else{
                System.out.println("Not a valid exit");
            }
        }

    }
}
