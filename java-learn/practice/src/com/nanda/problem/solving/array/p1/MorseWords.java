package com.nanda.problem.solving.array.p1;

import java.util.*;

public class MorseWords {

    public int uniqueMorseRepresentations(String[] words) {


        int transformationCount = 0;

        Set<String> codeSet = new TreeSet<>();

        Map<String, String> codeMap = getCodeMap();

        for (int i = 0; i < words.length; i++) {

            StringBuilder sb = new StringBuilder();

            String word = words[i];

            for (int j = 0; j < word.length(); j++) {

                sb.append(codeMap.get(String.valueOf(word.charAt(j))));
            }

            codeSet.add(sb.toString());
        }

        transformationCount = codeSet.size();

        return transformationCount;
    }

    public Map<String, String> getCodeMap() {

        String[] codes = {
                ".-","-...","-.-.","-..",".","..-.","--.","....","..",
                ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
                "..-","...-",".--","-..-","-.--","--.."};

        Map<String, String> hashMap = new HashMap<>();

        int codeIndex = 0;
        for (int i = 97; i < 123; i++) {
            hashMap.put(String.valueOf((char)i), codes[codeIndex++]);
        }



        return hashMap;


    }

    public static void main(String[] args) {
        new MorseWords().uniqueMorseRepresentations(new String[]{"gin","zen","gig","msg"});
    }
}
