package com.nanda.problem.solving.string.p4;

import java.util.HashMap;
import java.util.Map;

public class Q2278 {

    public int percentageLetter(String s, char letter) {


        int percentage = 0;

        Map<Character, Integer> counter = new HashMap<>();

        double wordLen = s.length();

        for (int i = 0; i < wordLen; i++) {

            if (counter.containsKey(s.charAt(i))) {
                Integer count = counter.get(s.charAt(i));
                counter.put(s.charAt(i), ++count);
            } else {
                counter.put(s.charAt(i), 1);
            }
        }

        Integer totalCount = counter.get(letter);

        if (totalCount == null) {
            return percentage;
        } else {
            double div = totalCount / wordLen;
            percentage = (int)(div * 100);
        }






        return percentage;

    }

    public static void main(String[] args) {
        new Q2278().percentageLetter("foobar",'o');
    }
}
