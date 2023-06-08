package com.nanda.problem.solving.array.p4;

import java.util.Arrays;
import java.util.Collections;

public class Q2108 {

    public String firstPalindrome(String[] words) {

        String palindrome = "";


        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            if (word.charAt(0) != word.charAt(word.length()-1)) {
                continue;
            }

            int k = word.length() - 1;
            int j = 0;
            while (k >= j) {

                if (word.charAt(j) != word.charAt(k)) {
                    break;
                }

                ++j;
                --k;

            }

            if (j>=k) {
                palindrome = word;
                return palindrome;
            }

        }

        return palindrome;

    }


    public static void main(String[] args) {
        new Q2108().firstPalindrome(new String[]{"abc","car","ada","racecar","cool"});
    }
}
