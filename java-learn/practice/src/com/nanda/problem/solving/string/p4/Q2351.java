package com.nanda.problem.solving.string.p4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q2351 {

    public char repeatedCharacter(String s) {

        Map<Character, ArrayList<Integer>> mapper = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character key = s.charAt(i);
            if (!mapper.containsKey(s.charAt(i))) {
                ArrayList<Integer> nums = new ArrayList<>();
                nums.add(i);
                mapper.put(key, nums);
            } else {
                ArrayList<Integer> nums= mapper.get(key);
                nums.add(i);
                mapper.put(key, nums);
            }
        }

        int minIndex = -1;
        char c = ' ';

        for (Map.Entry<Character, ArrayList<Integer>> entry : mapper.entrySet()) {

            if (entry.getValue().size() > 1) {
                if (minIndex == -1 || minIndex > entry.getValue().get(1)) {
                    minIndex = entry.getValue().get(1);
                    c = entry.getKey();
                }
            }
        }

        return c;
    }

    public static void main(String[] args) {
        new Q2351().repeatedCharacter("aabbbbbccddeeffa");
    }
}
