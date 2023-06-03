package com.nanda.problem.solving.string.p2;

public class Q2710 {

    public String removeTrailingZeros(String num) {

        String removedZeros = "";

        int endIndex = 0;
        for (int i = num.length() - 1; i >= 0 ; i--) {

            if (num.charAt(i) != '0') {
                break;
            }

            endIndex = i ;
        }

        if (endIndex == 0) {
            endIndex = num.length();
        }

        if (endIndex < 0) {
            return removedZeros;
        }

        removedZeros = num.substring(0,endIndex);
        return removedZeros;

    }

    public static void main(String[] args) {
        new Q2710().removeTrailingZeros("123");
    }
}
