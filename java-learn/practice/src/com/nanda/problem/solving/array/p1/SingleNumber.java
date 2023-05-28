package com.nanda.problem.solving.array.p1;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public int singleNumber(int[] nums) {

        int sNumber = -1;

        Map<Integer, Integer> counterMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (counterMap.containsKey(nums[i])) {
                int count = counterMap.get(nums[i]);

                counterMap.put(nums[i], ++count);
            } else {
                counterMap.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : counterMap.entrySet()) {
            if (entry.getValue() == 1) {
                sNumber = entry.getKey();
                break;
            }
        }

            return sNumber;

    }

    public static void main(String[] args) {
        new SingleNumber().singleNumber(new int[]{4,1,2,1,2});
    }
}
