package com.nanda.problem.solving.array.p1;

import java.util.Arrays;

public class MaxSumKelements {

    public int maximizeSum(int[] nums, int k) {

        int total = 0;

        Arrays.sort(nums);

        int lastIndex = nums.length - 1;

        for (int i = 0; i < k; i++) {
            int num = nums[lastIndex];
            total = total + num;
            nums[lastIndex] = num + 1;
        }

        return total;

    }

    public static void main(String[] args) {

        new MaxSumKelements().maximizeSum(new int[]{1,2,3,4,5}, 3);


    }
}
