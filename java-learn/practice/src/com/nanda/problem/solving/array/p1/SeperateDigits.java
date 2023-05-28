package com.nanda.problem.solving.array.p1;

import java.util.ArrayList;
import java.util.List;

public class SeperateDigits {

    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {
            extractDigits(nums[i], list);
        }

        return  list.stream().mapToInt(i -> i).toArray();
    }

    public void extractDigits(int num, List<Integer> list) {

        String digits = String.valueOf(num);

        for (int i = 0; i < digits.length(); i++) {
            list.add(Integer.parseInt(String.valueOf(digits.charAt(i))));
        }

    }

    public static void main(String[] args) {
        new SeperateDigits().separateDigits(new int[]{13,25,83,77});
    }
}
