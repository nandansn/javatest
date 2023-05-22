package com.nanda.problem.solving.array;

import java.util.*;

public class TargetArrayInOrder {

    public int[] createTargetArray(int[] nums, int[] index) {

        int[] target = new int[index.length];


        List<Integer> targetAsList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            targetAsList.add(index[i],nums[i]);
        }

        for (int i = 0; i < targetAsList.size(); i++) {
            target[i] = targetAsList.get(i);
        }



        return target;

    }

    public static void main(String[] args) {

        new TargetArrayInOrder().createTargetArray(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1});

    }
}
