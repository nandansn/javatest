package com.nanda.problem.solving.array.p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeInDiagonal {


    public int diagonalPrime(int[][] nums) {

        int largestPrime = 0;


        int cIndexFromRight = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            int left = nums[i][i];
            int right = nums[i][cIndexFromRight];
            --cIndexFromRight;
            if (isPrime(left) && left > largestPrime) {
                largestPrime = left;
            }

            if (isPrime(right) && right > largestPrime) {
                 largestPrime = right;
            }


        }


        return  largestPrime;

    }




    public boolean isPrime(int num) {

        boolean flag = true;

        if (num == 0) {
            return false;
        }

        if (num == 1) {
            return true;
        }

        int lastDigit = num % 10;

        if (Arrays.asList(0,2,4,6,8,5).contains(lastDigit)) {
            return false;
        }

        int copyfNum = num;
        int sum = 0;
        while (copyfNum  >= 1) {
            int r = copyfNum % 10;
            copyfNum = copyfNum / 10;
            sum = sum + r;
        }

        if (sum % 3 == 0) {
            return false;
        }


        int squareRoot = (int) Math.sqrt(num);


        List<Integer> primesBelowSqrRoot = new ArrayList<>();
        int incrementer = 1;
        for (int i = 2; i < squareRoot; ) {
            if (squareRoot % i == 0) {
                flag = false;
                break;
            }

            i = i + incrementer;
            incrementer = incrementer + 2;
        }

        return flag;
    }

    public static void main(String[] args) {

        int incrementer = 1;
        for (int i = 2; i < 100; ) {
//            if (100 % i == 0) {
//                flag = false;
//                break;
//            }


            System.out.println(i);

            incrementer = incrementer + 2;
            i = 2 + incrementer;

        }
        new PrimeInDiagonal().diagonalPrime(new int[][]{{3997649, 3996077, 3991037},{986231, 3992927, 3995437},{3998779, 3997603, 3998521}}
                );

        new PrimeInDiagonal().diagonalPrime(new int[][]{{1,2,3},{5,6,7},{9,10,11}}
        );
    }
}
