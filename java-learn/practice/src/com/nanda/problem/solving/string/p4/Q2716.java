package com.nanda.problem.solving.string.p4;

import com.nanda.problem.solving.array.p4.Q27;

import java.util.Set;
import java.util.TreeSet;

public class Q2716 {

    public int minimizedStringLength(String s) {

        Set<Character> charSet = new TreeSet<>();

        for (int i = 0; i < s.length(); i++) {
            charSet.add(s.charAt(i));
        }

        return charSet.size();

    }

    public static void main(String[] args) {

        new Q2716().minimizedStringLength("aaabc");
    }
}
