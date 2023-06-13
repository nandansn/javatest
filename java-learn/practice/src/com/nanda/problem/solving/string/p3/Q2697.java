package com.nanda.problem.solving.string.p3;

public class Q2697 {



    public String makeSmallestPalindrome(String s) {

        String palindrome = "";

        int i = 0;
        int j = s.length() - 1;

        int operations = 0;

        StringBuilder sb = new StringBuilder(s);

        while (i < j) {
            char charAtI = sb.charAt(i);
            char chatAtJ = sb.charAt(j);
            if (charAtI != chatAtJ){
                if (charAtI > chatAtJ){
                    sb.setCharAt(i,chatAtJ);
                } else {
                    sb.setCharAt(j, charAtI);
                }

                ++operations;
            }
            ++i;
            --j;
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        new Q2697().makeSmallestPalindrome("abcd");
    }
}
