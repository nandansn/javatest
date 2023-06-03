package com.nanda.problem.solving.string.p2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {
        String input = "aAAbbbb";
        String patternString = "a|A";

        // Create a Pattern object from the pattern string
        Pattern pattern = Pattern.compile(patternString);

        // Create a Matcher object from the input string
        Matcher matcher = pattern.matcher(input);

        // Find all occurrences of the pattern in the input string
        while (matcher.find()) {
            // Get the matched substring
            String match = matcher.group();

            // Print the matched substring
            System.out.println("Match: " + match);

            // Get the start and end index of the match
            int startIndex = matcher.start();
            int endIndex = matcher.end();
            System.out.println("Start index: " + startIndex);
            System.out.println("End index: " + endIndex);
        }
    }
}
