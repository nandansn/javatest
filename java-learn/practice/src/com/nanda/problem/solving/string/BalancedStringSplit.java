package com.nanda.problem.solving.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class BalancedStringSplit {

    public int balancedStringSplit(String s) {

        List<String> subString = new ArrayList<>();

        final StringBuilder[] sub = {new StringBuilder()};


        final AtomicInteger[] lCount = {new AtomicInteger()};
        AtomicInteger rCount = new AtomicInteger();

        Arrays.stream(s.split("")).forEach(c -> {
             if (c.equalsIgnoreCase("L")) {
                 sub[0].append(c);
                 lCount[0].addAndGet(1);
             }
             if (c.equalsIgnoreCase("R")) {
                 rCount.addAndGet(1);
                 sub[0].append(c);
             }

             if (lCount[0].get() == rCount.get()) {
                 subString.add(new String(sub[0]));
                 sub[0] = new StringBuilder();
             }
        });


        return subString.size();
    }

    public static void main(String[] args) {
        System.out.println(new BalancedStringSplit().balancedStringSplit("LLLLRRRR"));
    }
}
