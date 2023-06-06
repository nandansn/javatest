package com.nanda.problem.solving.array.p3;

import java.util.*;

public class Q905 {


    public int[] sortArrayByParity(int[] nums) {

        List<Integer> integers = new ArrayList<>(nums.length);




        for (int i = 0; i < nums.length; i++) {
            integers.add(0);
            System.out.println(integers.size());
        }

        int initial = 0;
        int last = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0) {
                integers.set(initial, nums[i]);
                ++initial;
            } else {
                integers.set(last, nums[i]);
                --last;
            }

        }
        int[] newInt = new int[nums.length];
        int i = 0;
       for (Integer n: integers) {
           newInt[i] = n;
           ++i;
       }


        return newInt;
    }

    public static void main(String[] args) {


        new Q905().sortArrayByParity(new int[]{3,1,2,4});

    }
}
