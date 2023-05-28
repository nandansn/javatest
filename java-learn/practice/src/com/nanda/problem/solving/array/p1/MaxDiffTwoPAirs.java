package com.nanda.problem.solving.array.p1;

import java.util.Arrays;

public class MaxDiffTwoPAirs {


    public int maxProductDifference(int[] nums) {

        int maxDiff = 0;

        Arrays.sort(nums);

        int p1 = nums[0] * nums [1];

        int p2 = nums[nums.length - 1] * nums[nums.length - 2];

        maxDiff = p2 - p1;


        return maxDiff;

    }

    public static void main(String[] args) {

        new MaxDiffTwoPAirs().maxProductDifference(new int[]{4,2,5,9,7,4,8});

    }
}
