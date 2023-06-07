package com.nanda.problem.solving.array.p3;

import java.util.Arrays;

public class Q1351 {

    public int countNegatives(int[][] grid) {

        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            int c = (int)Arrays.stream(grid[i]).filter(e -> e < 0).count();
            count = count + c;
        }


        return count;

    }

    public static void main(String[] args) {
        new Q1351().countNegatives(new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}});
    }
}
