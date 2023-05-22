package com.nanda.problem.solving.string;

import java.util.Arrays;

public class PalindromicSubstring {

    public String longestPalindrome(String s) {

        String longestSubString = s;

        if (isPalindrome(s)) {
            return longestSubString;
        } else {

            int startIndex = 0;
            int endIndex = startIndex ;

            int halfLength = s.length() / 2;



            int maxLength = 1;

            while (startIndex < s.length()) {

                if (endIndex == s.length() - 1) {
                    longestSubString = s.substring(startIndex);
                } else if (endIndex == 0) {
                    longestSubString = s.substring(startIndex, ++endIndex);

                } else {
                    longestSubString = s.substring(startIndex, endIndex);
                }

               // System.out.println(longestSubString);

                if (isPalindrome(longestSubString)) {
                    maxLength = longestSubString.length() > maxLength ? longestSubString.length() : maxLength;
                   // System.out.println(longestSubString);
                }



                if (endIndex == s.length() - 1) {
                    startIndex++;
                    //endIndex = startIndex;
                } else {
                    endIndex++;
                }

                if (startIndex == s.length() - 1) {
                    break;
                }


            }

            startIndex = 0;
            endIndex = s.length() - 1;

            while (halfLength > 0) {
                String substring = "";
                if (s.charAt(startIndex) == s.charAt(endIndex)) {
                    substring = s.substring(startIndex, endIndex);
                    System.out.println(substring);

                    if (isPalindrome(substring)) {
                        longestSubString = longestSubString.length() < substring.length() ? substring : longestSubString;
                    }
                }
                    endIndex--;
                    startIndex++;


                halfLength--;
            }


        }

            return longestSubString;

    }

    public String maxSubString(String s, int currentMaxLength) {

        String result = "";

        if (isPalindrome(s) && s.length() > currentMaxLength) {
            result = s;
        }

        return result;
    }

    private boolean isPalindrome(String s) {

        boolean result = false;


        result = s.equals(new StringBuilder(s).reverse().toString());


        return result;

    }


    public static void main(String[] args) {

        System.out.println(new PalindromicSubstring().longestPalindrome("abtbyybcbt"));


    }
}
