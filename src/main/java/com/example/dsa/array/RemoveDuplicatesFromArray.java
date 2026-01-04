package com.example.dsa.array;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        int [] arr = new int[]{1,2,2,3,4,5,6,6,7,7};
        System.out.println(Arrays.toString(arr));

        arr = removeDuplicatesFromSortedArray(arr);
    }

    private static int[] removeDuplicatesFromSortedArray(int[] arr) {
        int [] cleanedArr = new int [arr.length] ;

        int j = 0 ;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]!=arr[i+1]){
                cleanedArr[j++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(cleanedArr));
        return Arrays.copyOf(cleanedArr,cleanedArr.length);
    }
}
