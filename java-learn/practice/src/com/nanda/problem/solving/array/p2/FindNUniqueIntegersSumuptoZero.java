package com.nanda.problem.solving.array.p2;

public class FindNUniqueIntegersSumuptoZero {

    public int[] sumZero(int n) {


        int[] nums = new int[n];


        boolean isEven = n % 2 == 0 ? true : false;

        if (isEven) {
            int value = 1;
            for (int i = 0; i < n; i+=2) {
                nums[i] = value;
                nums[i+1] = value * -1;
                value++;
            }
        } else {
            nums[0] = 0;
            int value = 1;
            for (int i = 1; i < n; i+=2) {
                nums[i] = value;
                nums[i+1] = value * -1;
                value++;
            }
        }

        return nums;

    }

    public static void main(String[] args) {
        new FindNUniqueIntegersSumuptoZero().sumZero(5);
    }
}
