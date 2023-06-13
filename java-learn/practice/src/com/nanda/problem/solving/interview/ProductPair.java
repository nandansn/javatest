package com.nanda.problem.solving.interview;

import java.util.Arrays;

public class ProductPair {


    boolean isProduct(int[] arr, int n, long x) {
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {

            if (x % arr[i] == 0) {

                long result = x / arr[i];
                flag = Arrays.stream(arr).anyMatch(value -> result == value);

                if (flag) {
                    break;
                }
            }

        }

        return flag;
    }


    public static void main(String[] args) {
        boolean result = new ProductPair().isProduct(new int[]{5,7,9,22,15,344,92,8}, 8, 45);
        System.out.println(result);
    }
}
