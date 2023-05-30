package com.nanda.problem.solving.array.p2;

import java.util.TreeSet;

import java.util.Set;

public class Q961 {

    public int repeatedNTimes(int[] nums) {

        int repeatingNumber = 0;

        Set<Integer> uniqueSet = new TreeSet<>();


        for (int i = 0; i < nums.length; i++) {

            if (!uniqueSet.add(nums[i])) {
                repeatingNumber = nums[i];
                break;
            }

        }

        // iterate the nums
        // add each item to set
        // if that item exist break and return that num


        return repeatingNumber;

    }

    public static void main(String[] args) {

    }
}
