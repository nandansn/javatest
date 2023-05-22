package com.nanda.problem.solving.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArithmeticTriplets {

    public int arithmeticTriplets(int[] nums, int diff) {

        int i, j, k = 0;

        int tripletCount = 0;

        List<Integer> tempList = new ArrayList<>();

        for (int l = 0; l < nums.length; l++) {
            tempList.add(nums[l]);
        }


        for (int l = 0; l < nums.length; l++) {
            int sum = nums[l] + diff;

            if (tempList.contains(sum)) {
                i = l;
                j = tempList.indexOf(sum);
                sum = sum + diff;
                if (tempList.contains(sum)) {
                    k = tempList.indexOf(sum);
                    tripletCount += 1;
                }
            }


        }

        return tripletCount;

    }

    public static void main(String[] args) {

        new ArithmeticTriplets().arithmeticTriplets(new int[]{0,1,4,6,7,10},3);

    }
}
