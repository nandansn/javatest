package com.nanda.problem.solving.string.p3;

public class Q1832 {

    public boolean checkIfPangram(String sentence) {

        String[] letters = {
                "a",
                "b",
                "c",
                "d","" +
                "e","" +
                "f",
                "g",
                "h",
                "i",
                "j",
                "k",
                "l",
                "m",
                "n",
                "o",
                "p",
                "q",
                "r",
                "s",
                "t",
                "u",
                "v",
                "w",
                "x",
                "y",
                "z"
        };

        for (int i = 0; i < letters.length; i++) {
            if (sentence.indexOf(letters[i]) < 0) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        new Q1832().checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
    }
}


