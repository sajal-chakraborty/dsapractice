package com.example.dsa.array;

import java.util.Arrays;

public class Check_if_array_is_sorted {
    public static void main(String[] args) {

        int [] arr = new int [] {1,2,3,4,5,6,7,8,9} ;
        check_if_array_is_sorted(arr);
    }

    private static void check_if_array_is_sorted(int[] arr) {
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                System.out.println("Not sorted");
                return;
            }
        }
        System.out.println("Array Sorted..");
        System.out.println(Arrays.toString(arr));
    }
}
