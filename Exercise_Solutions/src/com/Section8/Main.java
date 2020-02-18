package com.Section8;

import java.util.Scanner;
import com.Section8.SortingAlgorithms.*;

public class Main {



    public static void main(String[] args) {
        //testSortArrays(5);
        //testFindMininum(5);
        testReverseArray(new int[]{1,2,3,4,5,6});
    }

    private static void testReverseArray(int[] array) {

        ReverseArray.reverse(array);
    }

        private static void testFindMininum(int count) {

        int min= FindMinimum.findMin(FindMinimum.readIntegers(count));
        System.out.println("Find Minimum: "+min);
    }

    private static void testReverseArray(int count) {
        System.out.println("Reverse array: ");
    }

    private static void testSortArrays(int capacity) {
        //int[] inputArray = getIntegerArray(capacity);
        int inputArray1[]={3,1,7,2,5};
        SortingAlgorithms.bubbleSortArray(capacity, inputArray1);
        int inputArray2[]={3,1,7,2,5};
        SortingAlgorithms.insertionSortArray(capacity, inputArray2);
        int inputArray3[]={3,1,7,2,5};
        SortingAlgorithms.selectionSortArray(capacity, inputArray3);
        int inputArray4[]={3,1,7,2,5};
        SortingAlgorithms.mergeSortArray(capacity, inputArray4);
    }



    private static int[] getIntegerArray(int capacity) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = new int[capacity];
        System.out.println("Input "+capacity+" integers for sorting.");
        for(int i=0;i<capacity;i++){
            inputArray[i]=scanner.nextInt();
        }
        return inputArray;

    }


}
