package com.example.dsa.array;

import java.util.Arrays;

public class ShiftZerosAtlast {

    public static void main(String[] args) {
        int [] array = {0,1,9,0,3,0,4,5,6};
        shiftZerosAtEnd_approach1(array);
        shiftZerosAtEnd_approach2(array);


    }

    private static void shiftZerosAtEnd_approach2(int[] array) {
        int replacedIndex =0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]!=0){
                array[replacedIndex++]=array[i];
//                System.out.println("replaced : " + array[i]);
            }
        }

        System.out.println("Array Length : " +array.length);
        System.out.println("Total Zeros replaced : "+replacedIndex);
        for (int i = replacedIndex; i < array.length; i++) {
            array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void shiftZerosAtEnd_approach1(int[] array) {
        int zeros = 0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i] == 0) {
                zeros ++;
            }
        }
        int finalArray[] = new int[array.length];
        System.out.println("no of Zeros : " + zeros);

        int counter =0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=0){
                finalArray[counter++] = array[i];
            }
        }

        for (int i = 0; i < zeros; i++) {
            finalArray[finalArray.length-1-i]=0;
        }

        Arrays.stream(finalArray).forEach(x-> System.out.println(x));
    }
}
