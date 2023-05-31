package com.nanda.problem.solving.array.p2;

public class Q2057 {

    public int smallestEqual(int[] nums) {

        int smallestIndex = nums.length;

        for (int i = 0; i < nums.length; i++) {

            int r = i % 10;



            if (r == nums[i]) {
                if (r < smallestIndex) {
                    smallestIndex = i;
                    break;
                }
            }

        }

        if (smallestIndex == nums.length) {
            smallestIndex = -1;
        }


        return smallestIndex;

    }

    public static void main(String[] args) {

        new Q2057().smallestEqual(new int[]{4,3,2,1});

    }
}
