package com.example.dsa.array;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        reverseArray_copy_into_another(arr);
        reverseArray_in_place(arr);
    }

    private static void reverseArray_in_place(int[] arr) {
        System.out.println(Arrays.toString(arr));

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }//Time Complexity O(N)  Space Complexity O(1)

    private static void reverseArray_copy_into_another(int[] arr) {
        System.out.println(Arrays.toString(arr));

        int index = 0;
        int[] reversedArray = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            //System.out.println(i + "==" + arr[i]);
            reversedArray[index++] = arr[i];
        }
        System.out.println(Arrays.toString(reversedArray));
    }//Time Complexity O(N)  Space Complexity O(n)
}
