package com.nanda.problem.solving.array.p4;

import java.util.Arrays;
import java.util.Comparator;

public class Q14 {

    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        StringBuilder prefix = new StringBuilder(strs[0]);


        for (int i = 1; i < strs.length; i++) {

            String item = strs[i];

            if (prefix.length() == 0 || item.length() ==0 || prefix.charAt(0) != item.charAt(0)) {
                prefix = new StringBuilder();
                break;
            }


            for (int j = 0; j < prefix.length(); j++) {

                if (prefix.charAt(j) != item.charAt(j)) {
                    prefix.delete(j, prefix.length());
                    break;
                }
            }


        }


        return prefix.toString();

    }

    public static void main(String[] args) {
        new Q14().longestCommonPrefix(new String[]{"flower","flow","flight"});
    }
}
