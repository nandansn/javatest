package com.nanda.problem.solving.string;

import java.util.Arrays;

public class ReversePrefix {

    public String reversePrefix(String word, char ch) {

        // find the index for the character

        int index = word.indexOf(ch);

        // get the substring from o to the found index, inclusive

        String subString1 = word.substring(0, index+1);
        String subString2 = word.substring(index+1, word.length());

        StringBuilder sb = new StringBuilder(subString1).reverse().append(subString2);


        return sb.toString();

    }

    public static void main(String[] args) {
        new ReversePrefix().reversePrefix("abcdefd",'d');
    }
}
