package com.nanda.problem.solving.array.p4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Q27 {

    public int removeElement(int[] nums, int val) {

       List<Integer> numList =  new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            numList.add(nums[i]);
            numList.removeIf(num -> num == val);
        }

        for (int i = 0; i < numList.size(); i++) {
            nums[i] = numList.get(i);
        }

        return numList.size();

    }

    public static void main(String[] args) {
        new Q27().removeElement(new int[]{3,2,2,3}, 3);
    }
}
