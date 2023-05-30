package com.nanda.problem.solving.array.p2;

import java.util.Arrays;
import java.util.TreeSet;

public class DisrinctDiffArray {

    public int[] distinctDifferenceArray(int[] nums) {

        int[] diff = new int[nums.length];


        for (int i = 0; i < nums.length; i++) {

            int[] lArray = Arrays.copyOfRange(nums, i+1,nums.length);
            long lcount = Arrays.stream(lArray).distinct().count();

            int[] rArray = Arrays.copyOfRange(nums,0, i+1);
            long rcount = Arrays.stream(rArray).distinct().count();

            long d = rcount - lcount;

            diff[i] = (int)d;

        }

      //  Arrays.sort(diff);

        return diff;

    }

    public static void main(String[] args) {
        new DisrinctDiffArray().distinctDifferenceArray(new int[]{1,2,3,4,5});
    }
}
