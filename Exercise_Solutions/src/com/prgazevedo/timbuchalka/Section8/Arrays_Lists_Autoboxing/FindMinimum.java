package com.prgazevedo.timbuchalka.Section8.Arrays_Lists_Autoboxing;

import java.util.Scanner;

public class FindMinimum {

    public static int[] readIntegers(int count){
        int[] arrayInt = new int[count];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the "+count+" number of integers - separated by CR.");
        for(int i=0;i<count;i++){
            arrayInt[i]=scanner.nextInt();
        }
        return arrayInt;
    }

    public static int findMin(int[] array){
        int min_index=0;
        for(int i=0; i<array.length;i++){
            if(array[i]<array[min_index]) min_index=i;
        }
        return array[min_index];

    }
}
