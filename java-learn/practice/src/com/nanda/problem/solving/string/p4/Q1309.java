package com.nanda.problem.solving.string.p4;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q1309 {

    public String freqAlphabets(String s) {

        Map<String, Character> charMap = createCharacterMap();

        StringBuilder sb = new StringBuilder(s);

        for (Map.Entry<String, Character> entry : charMap.entrySet()) {
            if (entry.getKey().contains("#")) {
                s = s.replaceAll(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }

        for (Map.Entry<String, Character> entry : charMap.entrySet()) {

                s = s.replaceAll(entry.getKey(), String.valueOf(entry.getValue()));

        }






        return s;
    }


    public static Map<String, Character> createCharacterMap() {
        Map<String, Character> charMap = new HashMap<>();

        // Add characters ('a' to 'i') represented by ('1' to '9')
        for (char c = 'a'; c <= 'i'; c++) {
            int value = c - 'a' + 1;
            String key = String.valueOf(value);
            charMap.put(key, c);
        }

        // Add characters ('j' to 'z') represented by ('10#' to '26#')
        for (char c = 'j'; c <= 'z'; c++) {
            int value = c - 'j' + 10;
            String key = value + "#";
            charMap.put(key, c);
        }

        return charMap;
    }


    public static void main(String[] args) {
        new Q1309().freqAlphabets("1326#");
    }
}
