package com.nanda.problem.solving.array.p4;

import java.util.Arrays;

public class Q26 {

    public int removeDuplicates(int[] nums) {
        int[] distinct = Arrays.stream(nums).distinct().toArray();

        for (int i = 0; i < distinct.length; i++) {
            nums[i] = distinct[i];
        }

        return distinct.length;
    }


    public static void main(String[] args) {
        new Q26().removeDuplicates(new int[]{1,1,2});
    }
}
