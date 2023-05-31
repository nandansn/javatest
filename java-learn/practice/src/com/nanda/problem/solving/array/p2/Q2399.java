package com.nanda.problem.solving.array.p2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Q2399 {

    public boolean checkDistances(String s, int[] distance) {

        boolean flag = true;


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            long cCount = s.chars().filter(ch -> ch ==c).count();
            if (cCount > 2 || cCount < 2) {
                return false;
            }
        }

        Map<Character, Integer> map = new HashMap<>();

        Character t = 'a';

        for (int i = 0; i < 26; i++) {

            map.put(t, i);
            ++t;
        }

        Set<Character> characterSet = new TreeSet<>();

        int distIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!characterSet.contains(c)) {
                characterSet.add(c);
                String subString = s.substring(i + 1);

                int startIndex = i;
                int endIndex = subString.indexOf(c);

                int disDiff = (endIndex + i) - startIndex;

                if (disDiff != distance[map.get(c)]) {
                    return false;
                }

                ++distIndex;
            }
        }

        return flag;

    }

    public static void main(String[] args) {

        new Q2399().checkDistances("zz", new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1});

    }
}
