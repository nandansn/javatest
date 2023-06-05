package com.nanda.problem.solving.array.p3;

import java.util.Arrays;

public class QN1 {

    public int[] twoSum(int[] nums, int target) {

        int[]  twoSum = new int[2];

        // get the first number from array
        // find diff of target and first number
        // check that diff is available in the array
        // if available find the index

        //loop

        for (int i = 0; i < nums.length; i++) {
            int firstIndex = i;
            int firstNumber = nums[i];

            for (int j = i+1; j < nums.length -1; j++) {
                int sum = nums[i] + nums[j];

                if (target == sum) {
                    twoSum[0] = i;
                    twoSum[1] = j;
                    break;
                }
            }
        }





        return twoSum;

    }

    public static void main(String[] args) {

        new QN1().twoSum(new int[]{2,7,11,15}, 9);

    }
}
