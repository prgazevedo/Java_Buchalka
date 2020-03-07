package com.prgazevedo.timbuchalka.Section12.Collections_Sets_Maps_Trees_Queues.Maps.Adventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Commands {
    private static Map<String,String>  commandMap = new HashMap<>();

     static  {
        commandMap.put("EAST","E");
        commandMap.put("E","E");
        commandMap.put("WEST","W");
        commandMap.put("W","W");
        commandMap.put("NORTH","N");
        commandMap.put("N","N");
        commandMap.put("SOUTH","S");
        commandMap.put("S","S");
        commandMap.put("QUIT","Q");
        commandMap.put("Q","Q");
    }

    public static String getExit(String choice){
        if(commandMap.containsKey(choice)){
            String exit= commandMap.get(choice);
            System.out.println("Your choice is go through exit: "+exit);
            return exit;
        } else{
            System.out.println("Not a valid command");
        }
        return null;
    }

    public static Set<String> getValidCommands(){
        return commandMap.keySet();

    }


}
