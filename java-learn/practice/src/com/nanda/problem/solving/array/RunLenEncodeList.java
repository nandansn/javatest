package com.nanda.problem.solving.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RunLenEncodeList {

    public int[] decompressRLElist(int[] nums) {

        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < nums.length; i+=2) {
            int freq = nums[i];
            int val = nums[i +1];

            for (int j = 0; j < freq; j++) {
                list.add(val);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        new RunLenEncodeList().decompressRLElist(new int[]{1,2,3,4});
    }
}
