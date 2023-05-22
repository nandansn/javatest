package com.nanda.problem.solving.string;

import java.util.Arrays;

public class TwoArraysAreEquivalent {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        boolean result = false;

       {
            StringBuilder string1 = new StringBuilder();
            StringBuilder string2 = new StringBuilder();

            for (int i = 0; i <word1.length ; i++) {
                string1.append(word1[i]);
            }

           for (int i = 0; i <word2.length ; i++) {
               string2.append(word2[i]);
           }

            result = string1.toString().equals(string2.toString());
        }


        return result;
    }

    public static void main(String[] args) {
        new TwoArraysAreEquivalent().arrayStringsAreEqual(new String[]{"ab", "cd"}, new String[]{"a", "bc"});
    }
}
