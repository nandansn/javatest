package com.nanda.problem.solving.array.p4;

public class Q1768 {

    public String mergeAlternately(String word1, String word2) {

        int lenOfWord1 = word1.length();
        int lenOfWord2 = word2.length();

        StringBuilder temp = new StringBuilder("");
        int loopLength = word1.length();

        if (lenOfWord1 > lenOfWord2) {
             temp.append(word1);
             loopLength = word2.length();
        }

        if (lenOfWord2 > lenOfWord1) {
            temp.append(word2);
            loopLength = word1.length();
        }

        StringBuilder result = new StringBuilder();

        int i = 0;
        for (i = 0; i < loopLength; i++) {
            result.append(word1.charAt(i)).append(word2.charAt(i));
        }

        if (temp.length() > 0) {
            result.append(temp.substring(i));
        }




        return result.toString();

    }

    public static void main(String[] args) {
        new Q1768().mergeAlternately("ab","pqrs");
    }
}
