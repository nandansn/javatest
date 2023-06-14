package com.nanda.problem.solving.string.p3;

public class Q1844 {

    public String replaceDigits(String s) {

        for (int i = 0; i < s.length(); ) {

            Boolean flag = Character.isDigit(s.charAt(i));

            if (flag && i > 0) {
                int val = Character.getNumericValue(s.charAt(i));
                int preVal = s.charAt(i-1);
                int sum = val + preVal;
                char c = (char) sum;
                s = s.replaceFirst(Character.toString(s.charAt(i)), Character.toString(c));
            }

            i = i + 1;
        }

        return s;

    }

    public static void main(String[] args) {
         new Q1844().replaceDigits("a1b2c3d4e");
    }
}
