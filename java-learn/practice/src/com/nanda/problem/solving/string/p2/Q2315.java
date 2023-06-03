package com.nanda.problem.solving.string.p2;

import java.util.Arrays;

public class Q2315 {

    public int countAsterisks(String s) {

        int count = 0;



        String[] tokens = s.split("\\|");

        for (int i = 0; i < tokens.length; i+=2) {
            count = count + (int)Arrays.stream(tokens[i].split("")).filter(c -> c.equals("*")).count();
        }

        return count;

    }


    public static void main(String[] args) {
        new Q2315().countAsterisks("l|*e*et|c**o|*de|");
    }
}
