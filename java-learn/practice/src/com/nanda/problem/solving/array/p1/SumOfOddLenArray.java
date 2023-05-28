package com.nanda.problem.solving.array.p1;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class SumOfOddLenArray {

    public int sumOddLengthSubarrays(int[] arr) {

        int sum = 0;


        int length = arr.length;

        int index = 1;
        Queue<Integer> oddQueue = new PriorityQueue<>();
        while (index <= arr.length) {
            oddQueue.add(index);
            index+=2;
        }

        int size = oddQueue.size();
        for (int i = 0; i < size; i++) {
            int end = oddQueue.remove();
            for (int k = 0; k <= arr.length - end; ) {
                sum = sum + Arrays.stream(arr,k,k+end).sum();
                k = k + 1;
            }

        }

        return sum;

    }

    public static void main(String[] args) {
        new SumOfOddLenArray().sumOddLengthSubarrays(new int[]{1,4,2,5,3});
    }
}
