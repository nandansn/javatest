package com.nanda.problem.solving.array;

public class FormSentence {

    public String truncateSentence(String s, int k) {


        StringBuilder sb = new StringBuilder();
        String[] tokens = s.split("\\s");

        k = k <= 0 ? s.length() : k;

        for (int index = 0; index < k; index++) {

            sb.append(tokens[index]).append(" ");

        }

        String sentence = sb.toString().trim();

        return sentence;


    }
}
