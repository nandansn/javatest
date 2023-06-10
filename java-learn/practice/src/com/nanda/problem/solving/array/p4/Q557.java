package com.nanda.problem.solving.array.p4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Q557 {

    public String reverseWords(String s) {

        StringBuilder result = new StringBuilder();

        String[] words = s.split("\\s");

        for (String word: words) {
            String reversed = new StringBuilder(word).reverse().toString();

            result.append(reversed+" ");

        }


        return  result.toString().trim();

    }

    public static void main(String[] args) {
        new Q557().reverseWords("Let's take LeetCode contest");
    }
}
