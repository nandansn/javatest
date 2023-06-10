package com.nanda.problem.solving.array.p4;

import com.nanda.problem.solving.array.p3.Q20;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Q2085 {

    public int countWords(String[] words1, String[] words2) {

        Map<String, Integer> counterMap = new ConcurrentHashMap<>();


        for (String word: words1) {
            if (counterMap.containsKey(word)) {
                int count = counterMap.get(word);
                counterMap.put(word, ++count);
            } else {
                counterMap.put(word,1);
            }
        }

        for (String key: counterMap.keySet()) {
            if (counterMap.get(key) > 1) {
                counterMap.remove(key);
            }
        }

        Map<String, Integer> counterMap2 = new ConcurrentHashMap<>();

        for (String word: words2) {
            if (counterMap2.containsKey(word)) {
                int count = counterMap2.get(word);
                counterMap2.put(word, ++count);
            } else {
                counterMap2.put(word,1);
            }
        }

        for (String key: counterMap2.keySet()) {
            if (counterMap2.get(key) > 1) {
                counterMap2.remove(key);
            }
        }

        int result = 0;



        for (String key: counterMap2.keySet()) {
            if (counterMap.get(key) != null) {
                ++result;
            }
        }




        return result;

    }


    public static void main(String[] args) {
    new Q2085().countWords(new String[]{"leetcode","is","amazing","as","is"},
            new String[]{"amazing","leetcode","is"});
    }
}
