package com.nanda.problem.solving.array;

import java.util.ArrayList;
import java.util.List;

public class CountVowelString {

    public int vowelStrings(String[] words, int left, int right) {


        List<Character> vowels = getVowels();

        int count = 0;


        for (int i = left; i <= right; i++) {

            String word = words[i];

            if (vowels.contains(word.charAt(0)) && vowels.contains(word.charAt(word.length()- 1))) {
                ++count;
            }
        }

        return count;

    }


    public List<Character> getVowels() {
        List<Character> vowels = new ArrayList<>();

        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        return vowels;
    }

    public static void main(String[] args) {
         new CountVowelString().vowelStrings(new String[]{"are","amy","u"}, 0 , 2);
    }
}
