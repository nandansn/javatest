package com.nanda.problem.solving.string;

import java.util.Arrays;
import java.util.Comparator;

public class SortSentences {

    public String sortSentence(String s) {

        String[] stringTokens = s.split("\\s");

        Arrays.sort(stringTokens, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                int compare =  o1.charAt(o1.length()-1) - o2.charAt(o2.length()-1);

                return compare;
            }
        });

        StringBuilder sb = new StringBuilder();

        Arrays.stream(stringTokens).forEach(token -> {
            sb.append(token.substring(0,token.length()-1)).append(" ");
        });

        String result = sb.toString().trim();

        return result;
    }


    public static void main(String[] args) {
        new SortSentences().sortSentence("is2 sentence4 This1 a3");
    }
}
