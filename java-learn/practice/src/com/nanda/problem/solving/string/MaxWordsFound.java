package com.nanda.problem.solving.string;

import java.util.Arrays;

public class MaxWordsFound {


    public int mostWordsFound(String[] sentences) {

        final int[] maxCount = {0};

        Arrays.stream(sentences).forEach(sen -> {
            int wordCount = sen.split("\\s").length;
            if (wordCount > maxCount[0]) {
                maxCount[0] = wordCount;
            }

        });

        return maxCount[0];

    }


    public static void main(String[] args) {
        System.out.println(new MaxWordsFound().mostWordsFound(new String[]{"please wait", "continue to fight", "continue to win"}
        ));
    }
}
