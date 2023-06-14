package com.nanda.problem.solving.string.p3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q1967 {

    public int numOfStrings(String[] patterns, String word) {


        int count = 0;


        for (int i = 0; i < patterns.length; i++) {
            Pattern pattern = Pattern.compile(patterns[i]);
            Matcher matcher =  pattern.matcher(word);

            if (matcher.find()) {
                ++count;
            }

        }


       return count;
    }

    public static void main(String[] args) {
        new Q1967().numOfStrings(new String[]{"a","abc","bc","d"}, "abc");
    }
}
