package com.nanda.problem.solving.array.p3;

import java.util.Arrays;

public class Q2206 {


    public boolean divideArray(int[] nums) {

        boolean flag = false;

        int pairs = nums.length % 2 == 0? nums.length / 2: 0;


        int count = 0;

        if (pairs == 0) {
            return flag;
        } else {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i+=2) {
                if (nums[i] == nums[i+1]) {
                    ++count;
                } else {
                    break;
                }
            }
        }

        if (count == pairs) {
            flag = true;
        }

        return flag;

    }


    public static void main(String[] args) {
        new Q2206().divideArray(new int[]{1,2,1,2,});
    }
}
