package com.nanda.problem.solving.array.p2;

import java.util.Arrays;

public class Q2357 {

    public int minimumOperations(int[] nums) {

        int minimumCount = 0;


        int max = Arrays.stream(nums).max().getAsInt();

        if (max == 0) {
            return minimumCount;
        } else {

            int[] copy = nums;
            Arrays.sort(copy);
            int min = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i]!=0) {
                    min = nums[i];
                    break;
                }
            }
            ++minimumCount;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[i] = nums[i] - min;
                }
            }

            return minimumCount + minimumOperations(nums);
        }


    }

    public static void main(String[] args) {


        System.out.println(new Q2357().minimumOperations(new int[]{1,5,0,3,5}));

    }
}
