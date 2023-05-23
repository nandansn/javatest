package com.nanda.problem.solving.array;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CountPairOfSimilarStrings {

    public int similarPairs(String[] words) {

        int count = 0;


        for (int i = 0; i < words.length - 1; i++) {

            Set<Character> wordSet = new TreeSet<>();
            String word = words[i];


            for (int j = 0; j < word.length(); j++) {
               wordSet.add(word.charAt(j));
            }

            for (int k = i + 1; k < words.length; k++) {


                String nextWord = words[k];
                Set<Character> nextWordSet = new TreeSet<>();
                for (int j = 0; j < nextWord.length(); j++) {
                    nextWordSet.add(nextWord.charAt(j));
                }

                if (wordSet.size() == nextWordSet.size()) {
                    if (wordSet.containsAll(nextWordSet)) {
                        count++;
                    }
                }

            }

        }


        return count;

    }

    public static void main(String[] args) {
        new CountPairOfSimilarStrings().similarPairs(new String[]{"aabb","ab","ba"});
    }

}
