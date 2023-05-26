package com.nanda.problem.solving.array;

import java.util.Arrays;

public class HeightChecker {

    public int heightChecker(int[] heights) {

        int count = 0;


        int[] copyHeightsAscOrder = Arrays.copyOf(heights, heights.length);

        Arrays.sort(copyHeightsAscOrder);

        for (int i = 0; i < heights.length; i++) {

            if (copyHeightsAscOrder[i] != heights[i]) {
                count++;
            }
        }


        return count;

    }

    public static void main(String[] args) {
        new HeightChecker().heightChecker(new int[]{1,1,4,2,1,3});
    }
}
