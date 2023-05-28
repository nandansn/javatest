package com.nanda.problem.solving.array.p1;

public class SomOfNs {

    public int sumOfMultiples(int n) {

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            int num  =   i % 3 == 0 ? i : i % 5 == 0 ? i : i % 7 == 0 ? i : 0;

            sum = sum + num;

        }
        return sum;
    }


    public static void main(String[] args) {
        new SomOfNs().sumOfMultiples(7);
    }
}
