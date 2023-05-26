package com.nanda.problem.solving.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class SumUniqueElements {

    public int sumOfUnique(int[] nums) {

        int sum = 0;


        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numMap.containsKey(nums[i])) {
//                Integer count = numMap.get(nums[i]);
//                numMap.put(nums[i], ++count);
                sum = sum - nums[i];
            } else {
                numMap.put(nums[i], 1);

                sum = sum + nums[i];
            }
        }

//        for (Integer key: numMap.keySet()) {
//            if (numMap.get(key) == 1) {
//                sum = sum + key;
//            }
//        }

        if (sum < 0) {
            sum = 0;
        }


        return sum;

    }


    public static void main(String[] args) {
        new SumUniqueElements().sumOfUnique(new int[] {1,2,3,2});
    }
}
