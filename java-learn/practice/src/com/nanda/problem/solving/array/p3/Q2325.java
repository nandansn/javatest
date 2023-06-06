package com.nanda.problem.solving.array.p3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q2325 {

    public String decodeMessage(String key, String message) {




        Map<Character, Character> charMap = new HashMap<>();

        int index = 97;

        for (int i = 0; i < key.length(); i++) {

            char c = key.charAt(i);

            if (c != ' ') {

                if (!charMap.containsKey(key.charAt(i))) {
                    charMap.put(c, (char)index);
                    ++index;
                }

            }


        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {

            char c = message.charAt(i);

            if (c != ' ') {
                char decoded = charMap.get(c);
                sb.append(String.valueOf(decoded));
            } else {
                sb.append(" ");
            }

        }

        return sb.toString();

    }

    public static void main(String[] args) {

        new Q2325().decodeMessage("the quick brown fox jumps over the lazy dog","vkbs bs t suepuv");

    }
}
