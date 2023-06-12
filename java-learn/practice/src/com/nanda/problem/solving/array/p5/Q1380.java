package com.nanda.problem.solving.array.p5;

import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1380 {

    public List<Integer> luckyNumbers (int[][] matrix) {

        // iterate the matrix
        // find max element in the row 'i'
        // iterate the column and check it is the minimum element

        List<Integer> min = new ArrayList<>();
        List<Integer> max = new ArrayList<>();

        int column = 0;

        List<Integer> lucky = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {

            int temp =  Arrays.stream(matrix[i]).min().getAsInt();

            min.add(temp);



        }

        int columnLength = matrix[0].length;
        for (int i = 0; i < columnLength; i++) {

            List<Integer> columns = new ArrayList<>();

            for (int j = 0; j < matrix.length; j++) {
                columns.add(matrix[j][i]);
            }

            int tempMax =  columns.stream().max(Integer::compare).get();

            max.add(tempMax);


        }

        for (Integer num: min) {
            if (max.indexOf(num) != -1) {
                lucky.add(num);
            }
        }

        return lucky;

    }

    public static void main(String[] args) {
        new Q1380().luckyNumbers(new int[][]{	{1,10,4,2},
                {9,3,8,7},
                {15,16,17,12}
        });
    }
}
