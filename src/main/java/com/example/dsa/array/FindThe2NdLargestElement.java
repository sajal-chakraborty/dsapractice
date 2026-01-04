package com.example.dsa.array;

import java.util.Arrays;

public class FindThe2NdLargestElement {
    public static void main(String[] args) {
        int arr [] = new int[]{1,2,3,56,7,8,9};
        findThe2NdLargestElement(arr);
    }

    private static void findThe2NdLargestElement(int[] arr) {
        System.out.println(Arrays.toString(arr));

        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least 2 elements");
        }
        int largest = 0;
        int secondLargest = 0;

        if(arr[0]<=arr[1]){
            largest = arr[1];
            secondLargest = arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i]>secondLargest && arr[i]<largest){
                secondLargest = arr[i];
            }
        }

        System.out.println("Largerst : " + largest);
        System.out.println("second Largest : " + secondLargest);

        System.out.println(Arrays.toString(arr));

    }

}
