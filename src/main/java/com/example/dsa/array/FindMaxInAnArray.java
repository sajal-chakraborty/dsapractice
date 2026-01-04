package com.example.dsa.array;

import java.util.Arrays;

public class FindMaxInAnArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 45, 4, 5, 6,-2};
        findMax(arr);
    }

    private static void findMax(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int max = arr[0]; //Don't consider any other hardcoded value.
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }
}
