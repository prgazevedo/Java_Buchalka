package com.prgazevedo.timbuchalka.Section12.Collections_Sets_Maps_Trees_Queues.Maps;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    static Map<String,String> languages = new HashMap<>();
    public static void main(String[] args) {

        languages.put("1-Java","Compiled high level, object oriented, platform independent language");
        languages.put("2-Python","interpreted , object oriented, high level language with dynamic semantics");
        languages.put("3-BASIC", "Beginners All purposes Symbolic intruction code");
        languages.put("4-ALGOL","Algorithmic language");

        /**
         *Notice that put returns previous value
         */
        System.out.println(languages.put("1-Java","A cup of coffee" ));
        if(languages.containsKey("Java")){
            System.out.println("Java in the map");
        }
        else System.out.println("Java not in the map");


        //test the removal
        System.out.println("Removing Algol");
        if(languages.remove("4-ALGOL")!=null) {
            System.out.println("Removed ALGOL");
        } else {
            System.out.println("4-ALGOL not in Map");
        }
        //test the replace
        System.out.println("Replacing Lisp #1");
        String key = "5-Lisp";
        if(languages.replace(key,"A functional language with imperative features")!=null){
            System.out.println("Replaced entry");
        } else System.out.println("Not replace");

        printMap();
        System.out.println("Replacing Lisp #2");
        languages.put(key,"A functional language with imperative features");
        if(languages.replace(key,languages.get(key),languages.get(key)+"!")){
            System.out.println("Replaced: "+ key);
        } else System.out.println("Not replaced");

        printMap();
    }
    public static void printMap(){
        //print out keyset and values
        /**
         *notice that there is not assurance of order
         */
        System.out.println("KeySet -> Value");
        System.out.println("=====================================================");
        for (String s:languages.keySet())
        {
            System.out.println(s+"-> Value:"+languages.get(s));
        }
        System.out.println("=====================================================");
    }

}
