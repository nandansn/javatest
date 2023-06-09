package com.nanda.problem.solving.array.p4;

import java.util.Arrays;

public class Q1491 {

    public double average(int[] salary) {


        double max = Arrays.stream(salary).max().getAsInt();
        double min = Arrays.stream(salary).min().getAsInt();

        double sum = Arrays.stream(salary).sum() - max - min;
        double avg = sum / ((salary.length) - 2);

        return avg;
    }


    public static void main(String[] args) {
        new Q1491().average(new int[]{48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000});
    }
}
