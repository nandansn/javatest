package com.nanda.problem.solving.array;

public class GoodPairs {

    public int numIdenticalPairs(int[] nums) {

        int goodPairs = 0;
        for (int i = 0; i < nums.length ; i++) {

            for (int j = nums.length - 1; j > i; j--) {

                if (nums[i] == nums[j]) {
                    goodPairs++;
                }

            }

        }


        return goodPairs;
    }

    public static void main(String[] args) {
        System.out.println(new GoodPairs().numIdenticalPairs(new int[]{1,1,1,1}));
    }
}
