package com.nanda.problem.solving.array;

public class ShuffleArray {

    public int[] shuffle(int[] nums, int n) {

        int[] shuffledArray = new int[nums.length];

        int j =0;
        for (int i = 0; i < nums.length; i++) {

            if (i % 2 == 0) {
                shuffledArray[i] = nums[j];
            } else {
                shuffledArray[i] = nums[n];
                n++;
                j++;
            }


        }


        return shuffledArray;

    }

    public static void main(String[] args) {

        new ShuffleArray().shuffle(new int[]{2,5,1,3,4,7}, 3);

    }
}
