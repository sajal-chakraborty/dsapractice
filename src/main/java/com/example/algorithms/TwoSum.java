package com.example.algorithms;

import java.util.HashMap;

public class TwoSum {


    
     public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] positions = new int[2];
        for(int i = 0 ; i < nums.length;i++){
            Integer complement = target - nums[i];
            if(!map.containsKey(complement)){
                map.put(nums[i],i);
            }else{
                positions[0] = map.get(complement);
                positions[1] = i;
                break;
            }
        
        }
        return positions;

    }
}
