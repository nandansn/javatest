package com.nanda.problem.solving.array.p1;

public class FindEvnNumDigits {

    public int findNumbers(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            int number = nums[i];
            int loopCount = 0;

            while (number >= 1) {
                int r = number % 10;
                number = number / 10;
                ++loopCount;
            }

            count = loopCount % 2 == 0 ? ++count : count;

        }


        return count;

    }

    public static void main(String[] args) {

        new FindEvnNumDigits().findNumbers(new int[]{12,345,2,6,7896});

    }
}
