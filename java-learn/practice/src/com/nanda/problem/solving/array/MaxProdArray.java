package com.nanda.problem.solving.array;

import java.util.Arrays;

public class MaxProdArray {

    public int maxProduct(int[] nums) {

        int maxProduct = 0;

        Arrays.sort(nums);

        int i = nums.length - 2;
        int j = nums.length - 1;

        maxProduct = (nums[i] - 1 ) * (nums[j] - 1 );



        return maxProduct;

    }



    public static void main(String[] args) {
        new MaxProdArray().maxProduct(new int[]{3,4,5,2});
    }
}
