package com.nanda.problem.solving.array.p2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q2431 {

    public int[] numberOfPairs(int[] nums) {

        int[] counter = new int[2];

        int numRemovedCount = 0;
        int numRemainingCount = 0;

        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {


            int finalI = i;
            System.out.println(String.format("%d,%d",nums[i],Arrays.stream(nums).filter(e -> e == nums[finalI]).count()));

           if (numMap.containsKey(nums[i])) {
               int count = numMap.get(nums[i]);
               numMap.put(nums[i], ++count);
            } else {
               numMap.put(nums[i],1);
           }

        }

        for (Map.Entry<Integer, Integer> entry: numMap.entrySet()) {

            if (entry.getValue() % 2 == 0) {
                numRemovedCount = numRemovedCount + entry.getValue() / 2;
            } else {
                numRemovedCount = numRemovedCount + entry.getValue() / 2;
                numRemainingCount = numRemainingCount + 1;
            }
        }

        counter[0] = numRemovedCount;
        counter[1] = numRemainingCount;

        return counter;
    }

    public static void main(String[] args) {
        new Q2431().numberOfPairs(new int[]{5,12,53,22,7,59,41,54,71,24,91,74,62,47,20,14,73,11,82,2,15,38,38,20,57,70,86,93,38,75,94,19,36,40,28,6,35,86,38,94,4,90,18,87,24,22});
    }
}
