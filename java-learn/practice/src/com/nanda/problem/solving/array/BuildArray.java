package com.nanda.problem.solving.array;

public class BuildArray {

    public int[] buildArray(int[] nums) {

        int[] buildArr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            buildArr[i] = nums[nums[i]];
        }


        return buildArr;

    }

    public static void main(String[] args) {

    }
}


