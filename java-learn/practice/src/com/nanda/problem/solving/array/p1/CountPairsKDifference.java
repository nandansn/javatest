package com.nanda.problem.solving.array.p1;

public class CountPairsKDifference {

    public int countKDifference(int[] nums, int k) {

        int countDiff = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                int diff = nums[i] - nums[j];

                diff = diff < 0 ? (diff * -1) : diff;

                if (diff == k) {
                    ++countDiff;
                }

            }

        }

        return  countDiff;

    }

    public static void main(String[] args) {
        new CountPairsKDifference().countKDifference(new int[]{1,2,2,1}, 1);
    }
}
