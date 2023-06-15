package com.nanda.problem.solving.string.p4;

import java.util.HashMap;
import java.util.Map;

public class Q1941 {

    public boolean areOccurrencesEqual(String s) {

        Map<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character key = s.charAt(i);
            if (countMap.containsKey(key)) {
                int count = countMap.get(key);
                countMap.put(key, ++count);
            } else {
                countMap.put(key, 1);
            }

        }

        int finalCount = countMap.get(s.charAt(0));

        for (Integer value: countMap.values()) {

            if (finalCount != value) {

                return false;

            }

        }

        return true;
    }

    public static void main(String[] args) {
        new Q1941().areOccurrencesEqual("abacb");
    }
}
