package com.nanda.problem.solving.array.p1;

public class SumOfOneDimArray {

    public int[] runningSum(int[] nums) {

        int[] sumArr = new int[nums.length];

        sumArr[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sumArr[i] = sumArr[i - 1] + nums[i];
        }

        return sumArr;

    }


    public static void main(String[] args) {

        new SumOfOneDimArray().runningSum(new int[]{1,2,3,4});

    }
}
