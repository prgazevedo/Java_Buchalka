package com.prgazevedo.timbuchalka.Section12.Collections_Sets_Maps_Trees_Queues.Sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {

    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <=100 ; i++) {
            squares.add(i*i);
            cubes.add(i*i*i);
        }

//        System.out.println("Squares until 100");
        /**
         *notice that the elements will be printed in chaotic order
         */
//        for (Integer i:squares){
//            System.out.println("\t"+i);
//        }
//        System.out.println("Cubes until 100");
//        for (Integer i:cubes){
//            System.out.println("\t"+i);
//        }

        // BULK OPERATIONS
        //Test the simetric union
        //-AddAll is a mathematical union (duplicates are removed)
        //-RetainAll is a mathematical intersection (only duplicates are preserved)
        //Union both sets
        Set<Integer> union = new HashSet<>(squares);
        //This is a Union because the addAll is "destructive"
        union.addAll(cubes);
        System.out.println("The union has "+union.size()+" entries");

        //intersection both sets
        Set<Integer> intersection = new HashSet<>(squares);
        //This is a Union because the addAll is "destructive"
        intersection.retainAll(cubes);
        System.out.println("The union has "+intersection.size()+" entries");

        Set<String> words = new HashSet<>();
        String sentence = "A Fox jumped over the brown fence";
        String[] array = sentence.split(" ");
        words.addAll(Arrays.asList(array));

        //Of course no sorted order
        for (String s:words){
            System.out.println(s);
        }

        //Test the asymetric difference
        //In this difference the intersection between sets is performed
        // and those items are removed from the other set
        // (in this case "to" and "is" are removed from each set in each way)
        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all","nature","is","but","art","unknown","to","thee"};
        String[] divineWords = {"to","err","is","human","to","forgive","divine"};
        nature.addAll(Arrays.asList(natureWords));
        divine.addAll(Arrays.asList(divineWords));

        System.out.println("Nature - Divine");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        printSet(diff1);

        System.out.println("Divine - Nature");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2);



        //containsAll tests if the set contains (is a subset) of another
        System.out.println("Create a intersection");
        Set<String> intersectionTest = new HashSet<>(divine);
        intersectionTest.retainAll(nature);

        if(nature.containsAll(divine)) System.out.println("divine is a subset of nature");
        else System.out.println("divine is NOT a subset of nature");
        if(nature.containsAll(intersectionTest)) System.out.println("intersection is a subset of nature");
        if(divine.containsAll(intersectionTest)) System.out.println("intersection is a subset of divine");

    }

    private static void printSet(Set<String> setStrings){
        for (String s:setStrings){
            System.out.print("\t"+s);
        }
        System.out.println();

    }
}
