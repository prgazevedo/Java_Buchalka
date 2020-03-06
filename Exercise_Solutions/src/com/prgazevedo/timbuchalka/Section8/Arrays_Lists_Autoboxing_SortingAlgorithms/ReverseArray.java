package com.prgazevedo.timbuchalka.Section8.Arrays_Lists_Autoboxing_SortingAlgorithms;

class ReverseArray {


    public static void reverse(int[] array){
        printArray("Ordered array:",array);
        for(int i=0;i<(array.length+1)/2; i++){
            int temp=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=temp;
        }
        printArray("Reverse ordered array:",array);

    }

    private static void printArray(String text,int[] array){
        System.out.println(text);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

}
