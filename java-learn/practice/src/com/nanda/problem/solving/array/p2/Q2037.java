package com.nanda.problem.solving.array.p2;

import java.util.Arrays;

public class Q2037 {

    public int minMovesToSeat(int[] seats, int[] students) {

        int minimumMoves = 0;

        Arrays.sort(seats);

        Arrays.sort(students);

        for (int i = students.length - 1; i >=0 ; i--) {

            int move  = students[i] - seats[i];

            if (move < 0) {
                move = move * -1;
            }

            minimumMoves = minimumMoves + move;

        }

        return minimumMoves;

    }


    public static void main(String[] args) {

        new Q2037().minMovesToSeat(new int[]{4,1,5,9}, new int[]{1,3,2,6});

    }
}
