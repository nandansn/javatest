package com.nanda.problem.solving.array.p2;

import java.util.Arrays;

public class Q977 {

    public int[] sortedSquares(int[] nums) {

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            result[i] = (int)Math.pow(nums[i], 2);

        }

        Arrays.sort(result);


        return result;


    }

    public static void main(String[] args) {

        new Q977().sortedSquares(new int[]{-4,-1,0,3,10});

    }
}
