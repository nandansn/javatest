package com.nanda.problem.solving.array.p1;

public class CountPrefixOfString {

    public int countPrefixes(String[] words, String s) {

        int count = 0;

        // iterate the element

        for (int i = 0; i < words.length; i++) {
            int wordSize = words[i].length();

            wordSize = wordSize > s.length() ? s.length() : wordSize;

            String subStringOfS = s.substring(0, wordSize);

            String regex = "^"+subStringOfS+".*";

            if (words[i].matches(regex) ) {
                ++count;
            }
        }
        // for each element
            // get the size,
            // if the size is greater than size of 's', only consider the 's' size
            // use that size as range to get the substring
            // use regex to match the prefix





        return count;

    }

    public static void main(String[] args) {
        new CountPrefixOfString().countPrefixes(new String[]{"a","b","c","ab","bc","abc"}, "abc");
    }
}
