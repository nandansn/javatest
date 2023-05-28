package com.nanda.problem.solving.array.p1;

public class CountGoodTriplets {

    public int countGoodTriplets(int[] arr, int a, int b, int c) {

        int count = 0;

        // get sub array,
        // assign

        for (int i = 0; i < arr.length - 2; i++) {

            for (int j = i+1; j < arr.length - 1; j++) {
                int nums[] = new int[3];
                nums[0] = arr[i];
                nums[1] = arr[j];
                nums[2] = arr[j+1];
                if (isTriplet(nums, a ,b, c)) {
                    count++;
                }

            }

        }

        return count;
    }

    public boolean isTriplet(int nums[], int a, int b, int c) {

       int i = nums[0];
       int j = nums[1];
       int k = nums[2];

       if (a >= (i - j) && b>= (j - k) && c >= (k - i)) {
           return true;
       } else {
           return false;
       }
    }

    public static void main(String[] args) {
        new CountGoodTriplets().countGoodTriplets(new int[]{3,0,1,1,9,7}, 7,2,3);
    }
}
