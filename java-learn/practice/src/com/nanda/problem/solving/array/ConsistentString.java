package com.nanda.problem.solving.array;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class ConsistentString {

    public int countConsistentStrings(String allowed, String[] words) {

        int consistentCount = 0;

        Set<Character> allowedCharacters = new TreeSet<>();

        for (int i = 0; i < allowed.length(); i++) {
            allowedCharacters.add(allowed.charAt(i));
        }



        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            for (int j = 0; j < word.length() ; j++) {

                if (!allowedCharacters.contains(word.charAt(j))) {
                    break;
                }

                if (j == (word.length() -1)) {
                    consistentCount++;
                }
            }
        }

        return consistentCount;

    }

    public static void main(String[] args) {
        new ConsistentString().countConsistentStrings("ab", new String[]{"ad","bd","aaab","baa","badab"});
    }
}
