package com.nanda.problem.solving.string.p4;

import java.util.Set;
import java.util.TreeSet;

public class Q1704 {

    public boolean halvesAreAlike(String s) {



        String vowels = "aeiouAEIOU";

        int wordLength = s.length() / 2;

        int aCount = 0;

        for (int i = 0; i <wordLength ; i++) {
            if (vowels.indexOf(s.charAt(i)) >= 0) {
                ++aCount;
            }
        }

        int bCount = 0;

        for (int i = wordLength; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) >= 0) {
                ++bCount;
            }
        }

        if (aCount == bCount) {
            return true;
        } else {
            return  false;
        }

    }

    public static void main(String[] args) {
        new Q1704().halvesAreAlike("textbook");
    }
}
