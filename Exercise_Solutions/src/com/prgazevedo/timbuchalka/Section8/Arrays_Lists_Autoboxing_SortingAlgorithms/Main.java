package com.prgazevedo.timbuchalka.Section8.Arrays_Lists_Autoboxing_SortingAlgorithms;

import com.prgazevedo.timbuchalka.Section8.Arrays_Lists_Autoboxing_SortingAlgorithms.ArrayListChallenge.MobilePhone;
import com.prgazevedo.timbuchalka.Section8.Arrays_Lists_Autoboxing_SortingAlgorithms.AutoboxingChallenge.Bank;
import com.prgazevedo.timbuchalka.Section8.Arrays_Lists_Autoboxing_SortingAlgorithms.LinkedListChallenge.PlayList;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        testSortArrays();
        //testFindMininum(5);
        //testReverseArray(new int[]{1,2,3,4,5,6});
        //testMobilePhone();
        //testBank();
        //testPlayList();
    }

    private static void testPlayList() {
        PlayList playList = new PlayList();
        playList.runPlayList();
    }

    private static void testMobilePhone(){
        MobilePhone phone = new MobilePhone(new Scanner(System.in));
        phone.run( );

    }


    private static void testBank(){
        Bank bank = new Bank();
        bank.runBank();

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

    private static void testSortArrays() {
        //int[] inputArray = getIntegerArray(capacity);
        int inputArray1[]={3,1,7,2,5};
        SortingAlgorithms.bubbleSortArray(inputArray1.length, inputArray1);
        int inputArray2[]={3,1,7,2,5};
        SortingAlgorithms.insertionSortArray(inputArray2.length, inputArray2);
        int inputArray3[]={3,1,7,2,5};
        SortingAlgorithms.selectionSortArray(inputArray3.length, inputArray3);
        int inputArray4[]={3,1,7,2,5};
        SortingAlgorithms.mergeSortArray(inputArray4.length, inputArray4);
        int inputArray5[]={3,1,7,2,5};
        SortingAlgorithms.bubbleSortList(SortingAlgorithms.initializeList(inputArray5));
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
