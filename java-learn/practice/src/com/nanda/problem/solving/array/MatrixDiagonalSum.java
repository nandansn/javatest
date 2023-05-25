package com.nanda.problem.solving.array;

public class MatrixDiagonalSum {

    public int diagonalSum(int[][] mat) {

        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            sum = sum + mat[i][i];
            int rightIndex = (mat.length - 1) - i;
            if ( i != rightIndex) {
                sum = sum + mat[i][rightIndex];
            }

        }


        return sum;

    }

    public static void main(String[] args) {
        new MatrixDiagonalSum().diagonalSum(new int[][]{{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}});
    }
}
