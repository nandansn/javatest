package com.nanda.problem.solving.array.p2;

import java.util.Arrays;

public class Q2154 {


    public int findFinalValue(int[] nums, int original) {

        do {
            int finalNumberToFound = original;
            boolean flag = Arrays.stream(nums).anyMatch(n -> n == finalNumberToFound);

            if (flag) {
                original = 2 * original;
            } else {break;
            }

        } while (true);

        return original;
    }

    public static void main(String[] args) {

        new Q2154().findFinalValue(new int[]{5,3,6,1,12}, 3);

    }
}

