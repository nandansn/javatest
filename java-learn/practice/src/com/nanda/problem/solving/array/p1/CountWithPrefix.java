package com.nanda.problem.solving.array.p1;

public class CountWithPrefix {

    public int prefixCount(String[] words, String pref) {

        int count = 0;


        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(pref)) {
                ++count;
            }
        }


        return count;

    }

    public static void main(String[] args) {
        new CountWithPrefix().prefixCount(new String[]{"pay","attention","practice","attend"}, "at");
    }
}
