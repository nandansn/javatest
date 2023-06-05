package com.nanda.problem.solving.array;

import java.util.Arrays;
import java.util.Comparator;

public class DeleteColumnsToSorted {

    public int minDeletionSize(String[] strs) {

        int count = 0;

        int strLength = strs[0].length();

        for (int i = 0; i < strLength; i++) {

            String grid = "";

            for (int j = 0; j < strs.length; j++) {

                char c = strs[j].charAt(i);

                grid = grid.concat(String.valueOf(c));

            }



            String sorted = Arrays.stream(grid.split("")).sorted().reduce("", (a, e) -> a + e);

            if (!grid.equals(sorted)) {
                ++count;
            }

        }

        return count;

    }

    public static void main(String[] args) {
        new DeleteColumnsToSorted().minDeletionSize(new String[]{"zyx","wvu","tsr"});
    }
}
