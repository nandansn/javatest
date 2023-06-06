package com.nanda.problem.solving.array.p3;

public class Q344 {

    public void reverseString(char[] s) {

        int j = s.length - 1;

        for (int i = 0; i < s.length; i++) {
            if (i == j || j < i) {
                break;
            }
            char t = s[i];
            s[i] = s[j];
            s[j] = t;
            j = j - 1;
        }




    }


    public static void main(String[] args) {
        new Q344().reverseString(new char[]{'H','a','n','n','a','h'});
    }
}
