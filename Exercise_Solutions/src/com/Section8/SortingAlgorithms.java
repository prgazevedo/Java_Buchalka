package com.Section8;

import java.util.Scanner;

public class SortingAlgorithms {



    //bubble sort --> the simplest sorting algorithm
    public static int[] bubbleSortArray(int arraySize, int[] inputArray){
        // Has O(n^2) but is worse than insertion sort
        System.out.println("Sorting using bubble sort algorithm");
        System.out.println("UnSorted array is:");
        for(int i=0;i<arraySize;i++){
            System.out.println(inputArray[i]);
        }
        boolean done = true;
        while(done){
            done=false;
            for(int i=0;i<inputArray.length-1;i++){
                if(inputArray[i]>inputArray[i+1]){
                    //we swap
                    int temp = inputArray[i];
                    inputArray[i] = inputArray[i+1];
                    inputArray[i+1] = temp;
                    done=true;
                }
            }

        }
        System.out.println("Sorted array is:");
        for(int i=0;i<arraySize;i++){
            System.out.println(inputArray[i]);
        }
        return inputArray;

    }

    //insertion sort
    public static int[] insertionSortArray(int arraySize, int[] inputArray) {
        //insertion sort --> not efficient for large sets but recognizes if the data is already sorted!
        //"quick and dirty approach" O(n^2)
        // performs more swaps (watch out for large items) and less comparisons
        // plus: does not use extra storage
        //https://www.youtube.com/watch?v=i-SKeOcBwko
        System.out.println("Sorting using insert sort algorithm");
        System.out.println("UnSorted array is:");
        for(int i=0;i<arraySize;i++){
            System.out.println(inputArray[i]);
        }

        for(int i=1;i<arraySize;i++){
            int value=inputArray[i];
            int hole=i;
            while(hole>0 && inputArray[hole-1]>value){
                //Shifting the elements from left to right if they are greater that value.
                inputArray[hole]=inputArray[hole-1];
                hole=hole-1;
            }
            inputArray[hole]=value;
        }
        System.out.println("Sorted array is:");
        for(int i=0;i<arraySize;i++){
            System.out.println(inputArray[i]);
        }
        return inputArray;
    }

    //selection sort
    public static int[] selectionSortArray(int arraySize, int[] inputArray) {
        //selection sort --> not efficient for large data set (worse earlier than insertion sort for larger data)
        //"quick and dirty approach" O(n^2)
        // performs more comparisons (watch out for long comparisons) and less swaps
        // plus: does not use extra storage
        System.out.println("Sorting using selection sort algorithm");
        System.out.println("UnSorted array is:");
        for(int i=0;i<arraySize;i++){
            System.out.println(inputArray[i]);
        }

        //Find Min Value
        int min_index=0;
        for(int i=0; i<inputArray.length;i++){
            min_index=i;
            //the rest of the array to search for minimums to swap
            for(int j=i+1;j<inputArray.length;j++){
                if(inputArray[j]<inputArray[i]){
                    min_index=j;
                    //Now swap
                    int temp= inputArray[i];
                    inputArray[i]=inputArray[j];
                    inputArray[j]=temp;

                }
            }
        }

        System.out.println("Sorted array is:");
        for(int i=0;i<arraySize;i++){
            System.out.println(inputArray[i]);
        }
        return inputArray;
    }




    //merge sort
    public static int[] mergeSortArray(int arraySize, int[] inputArray) {
        //merge sort --> recursive algorithm
        //"more efficient approach" O(n*logN)
        // minus: uses extra storage
        // blatant copy from: https://codereview.stackexchange.com/questions/122697/simple-java-mergesort-implementation
        System.out.println("Sorting using merge sort algorithm");
        System.out.println("UnSorted array is:");
        for(int i=0;i<arraySize;i++){
            System.out.println(inputArray[i]);
        }
        inputArray= mergeSort(inputArray);

        System.out.println("Sorted array is:");
        for(int i=0;i<arraySize;i++){
            System.out.println(inputArray[i]);
        }
        return inputArray;
    }



    private static int[] merge(int[] first, int[] second) {
        int[] merged = new int[first.length + second.length];

        int firstIndex = 0;
        int secondIndex = 0;
        int index = 0;

        while (firstIndex < first.length && secondIndex < second.length) {
            if (first[firstIndex] < second[secondIndex]) {
                merged[index++] = first[firstIndex++];
            } else {
                merged[index++] = second[secondIndex++];
            }
        }

        while (firstIndex < first.length) {
            merged[index++] = first[firstIndex++];
        }

        while (secondIndex < second.length) {
            merged[index++] = second[secondIndex++];
        }

        return merged;
    }

    public static int[] mergeSort(int[] inputArr) {

        int n = inputArr.length;

        // Base Case: Array's length is less than 1
        if (n <= 1) {
            return inputArr;
        }

        // Creating two arrays to store values
        int[] arrayA = new int[n / 2];
        int[] arrayB = new int[n - (n / 2)];



        // Initializing arrayA
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = inputArr[i];
        }

        // Initializing arrayB
        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = inputArr[i + (n / 2)];
        }

        // Divide array into 2 halves
        // Recursive part
        arrayA = mergeSort(arrayA);
        arrayB = mergeSort(arrayB);
        return merge(arrayA, arrayB);

    }
}
