package com.example.dsa.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateElementsArray {

    public static void main(String[] args) {
        int [] arr = new int []{1,2,3,4,2,4,4,1,4};
        System.out.println(Arrays.toString(arr));
        finduplicates_bruteforce_way(arr);
        finduplicates_optimized_way1(arr);

    }

    private static void finduplicates_optimized_way1(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
             if(arr[i] == arr[j] && i!=j){
                 System.out.println("Duplicate :: " + arr[i]);
                 break;
             }

            }
        }
    }

    private static void finduplicates_bruteforce_way(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int i:arr){
            Integer counter = map.get(i);
            if(counter !=null){
                counter = counter+1;
                map.put(i, counter);
            }
            else{
                map.put(i,1);
            }
        }
        System.out.println(map);
        for(Integer key : map.keySet()){
            if(map.get(key)>1){
                System.out.println("Duplicate : " + key + " Occurrences : " + map.get(key));
            }
        }
    }// This has O(n+n) time and O(n) space complexity, which is ok. but space could be improved.
}
