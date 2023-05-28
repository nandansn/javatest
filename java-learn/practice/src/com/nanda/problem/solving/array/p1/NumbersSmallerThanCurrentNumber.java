package com.nanda.problem.solving.array.p1;

import java.util.Arrays;

public class NumbersSmallerThanCurrentNumber {

    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] smallerNumCounts = new int[nums.length];

        int[] copyOfNums = nums.clone();

        Arrays.sort(copyOfNums);

        for (int i = 0; i < nums.length ; i++) {

            int count = 0;

            for (int j = 0; j < copyOfNums.length; j++) {

                if (nums[i] > copyOfNums[j]) {
                    count++;
                } else {
                    break;
                }
            }

            smallerNumCounts[i] = count;
        }





        return smallerNumCounts;

    }

    public static void main(String[] args) {
            new NumbersSmallerThanCurrentNumber().smallerNumbersThanCurrent(new int[]{8,1,2,2,3});
    }
}
