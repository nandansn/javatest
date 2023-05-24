package com.nanda.problem.solving.array;

public class ElementAndDigitSum {

    public int differenceOfSum(int[] nums) {

        int diff = 0;

        int elementSum = 0;

        int digitSum = 0;

        for (int i = 0; i < nums.length; i++) {
            elementSum = elementSum + nums[i];

            int currentNumber = nums[i];

            do {
                int r = currentNumber % 10;
                currentNumber = currentNumber / 10;
                digitSum = digitSum + r;
            } while ( currentNumber >= 1  );

        }

        diff = elementSum - digitSum;

        return diff;

    }


    public static void main(String[] args) {


       new ElementAndDigitSum().differenceOfSum(new int[]{2,7,8,10,8,10,1,10,5,9});
    }
}
