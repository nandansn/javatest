package com.nanda.problem.solving.array.p1;

public class RightLeftSumDiff {


    public int[] leftRightDifference(int[] nums) {

        int[] diffs = new int[nums.length];


        for (int i = 0; i < nums.length; i++) {

            int  rightSum =0;
            int leftSum = 0;

            for (int j = i-1; j >= 0; j--) {
                rightSum = rightSum + nums[j];
            }


            for (int j = i + 1; j < nums.length; j++) {
                leftSum = leftSum + nums[j];
            }

            int diff = leftSum - rightSum;

            diff = diff < 0 ? diff *= -1 : diff;

            diffs[i] = diff;

        }


        return diffs;

    }

    public static void main(String[] args) {
        System.out.println(new RightLeftSumDiff().leftRightDifference(new int[]{10,4,8,3}));
    }
}
