package com.nanda.problem.solving.string.p4;

import java.util.*;

public class Q1370 {

    public String sortString(String s) {

        Set<Character> chars = new TreeSet<>();

        int dCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!chars.add(s.charAt(i))) {
               ++dCount;
            }

        }

        int maxLoop = s.length() - dCount;

        StringBuilder result = new StringBuilder("");

        List<String> characterList = new ArrayList<>();

        for(Character c: chars) {
            characterList.add(String.valueOf(c));
        }

        for (int i = 0; i < maxLoop; i+=2) {

            if (result.length() < s.length()) {

                for (int j = 0; j < characterList.size(); j++) {
                    result.append(characterList.get(j));
                }
            }
            if (result.length() < s.length()) {
                for (int j = characterList.size() - 1; j >= 0; j--) {
                    result.append(characterList.get(j));
                }
            }
        }

//        System.out.println(result.toString());
//        System.out.println(result.toString().length());

        return result.toString();

    }

    public static void main(String[] args) {
        new Q1370().sortString("abc");
    }
}
