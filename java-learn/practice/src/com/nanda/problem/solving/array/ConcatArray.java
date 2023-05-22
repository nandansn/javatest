package com.nanda.problem.solving.array;

public class ConcatArray {

    public int[] getConcatenation(int[] nums) {

        int newNums[] = new int[nums.length*2];

        for (int i = 0; i < nums.length ; i++) {
            newNums[i]= nums[i];
        }
        int j = newNums.length / 2;
        for (int i = 0; i < nums.length ; i++) {
            newNums[j] = nums[i];
            j++;
        }

        return newNums;

    }

    public static void main(String[] args) {

        System.out.println(new ConcatArray().getConcatenation(new int[]{1,2,1}));
    }
}
