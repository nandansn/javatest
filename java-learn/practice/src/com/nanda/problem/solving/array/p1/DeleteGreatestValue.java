package com.nanda.problem.solving.array.p1;

import java.util.Arrays;

public class DeleteGreatestValue {

    public int deleteGreatestValue(int[][] grid) {

        int sum = 0;
        int max = 0;

        int[] copyOfGrid = null;

        do {

             max = 0;

            for (int i = 0; i < grid.length; i++) {
                copyOfGrid = Arrays.copyOf(grid[i], grid[i].length);
                Arrays.sort(copyOfGrid);
                int lastIndex = copyOfGrid.length - 1;
                int value = copyOfGrid[lastIndex];
                max = value > max ? value : max;
                grid[i] = Arrays.copyOfRange(copyOfGrid, 0, copyOfGrid.length-1);

            }


            sum = sum + max;

        } while (copyOfGrid.length > 1);




        return sum;

    }

    public static void main(String[] args) {

        new DeleteGreatestValue().deleteGreatestValue(new int[][]{{1,2,4},{3,3,1}});

    }
}
