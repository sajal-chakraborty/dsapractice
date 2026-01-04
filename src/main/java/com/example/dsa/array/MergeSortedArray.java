package com.example.dsa.array;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {

        int[] sortedArray1 = {1, 3, 4, 6, 30};
        int[] sortedArray2 = {4, 5, 20, 32};

        mergeSortedArrays(sortedArray1, sortedArray2);

    }

    private static void mergeSortedArrays(int[] sortedArray1, int[] sortedArray2) {
//        int [] sortedArray1 = {1,3,4,6,30};
//        int [] sortedArray2 = {4,5,20,32};

        int i = 0;
        int j = 0;
        int index = 0;
        int arr[] = new int[sortedArray1.length + sortedArray2.length];
        while (i < sortedArray1.length && j < sortedArray2.length) {
//            while (j < sortedArray2.length) {
                System.out.println("array1 :" + sortedArray1[i] + " array2 : " + sortedArray2[j]);
                if (sortedArray1[i] <=   sortedArray2[j]) {
                    arr[index++] = sortedArray1[i++];
//                    System.out.println("Array 1 element inserted : " + sortedArray1[i]);
//                    i++;
//                    break;
                } else {
                    arr[index++] = sortedArray2[j++];
//                    System.out.println("Array 2 element inserted : " + sortedArray2[j]);
//                    j++;
                }
//            }

        }

        while(i<sortedArray1.length){
            arr[index++] = sortedArray1[i++];
        }

        while(j<sortedArray2.length){
            arr[index++] = sortedArray2[j++];
        }

        System.out.println(Arrays.toString(arr));
    }
}
