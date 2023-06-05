package com.nanda.problem.solving.array;

import java.util.Arrays;

public class GreatedCommonDivisor {

    public int findGCD(int[] nums) {

        int commonDivisor = 0;

        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();

        for (int i = 1; i <= min; i++) {
            if (max % i == 0 && min % i == 0) {
                commonDivisor = i;
            }
        }
        return commonDivisor;
    }

    public static void main(String[] args) {
        new GreatedCommonDivisor().findGCD(new int[]{2,5,6,9,10});
        String s = Arrays.stream("nanda".split("")).sorted().reduce("", (c, a) -> { return c.concat(a); });

        System.out.println(s);
    }
}
