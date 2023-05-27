package com.nanda.problem.solving.array;

import java.util.Arrays;

public class RowWithMaxOnes {


    public int[] rowAndMaximumOnes(int[][] mat) {

        int maxCount = 0;

        int[] max = new int[2];

        for (int i = 0; i < mat.length; i++) {

            long count = Arrays.stream(mat[i]).filter(e -> e == 1).count();
            if (count > maxCount) {
                max[0] = i;
                max[1] = (int) count;
                maxCount = max[1];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        new RowWithMaxOnes().rowAndMaximumOnes(new int[][]{{0,1},{1,0}});
    }
}
