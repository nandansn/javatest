package com.nanda.problem.solving.array.p1;

public class CustomerWealth {

    public int maximumWealth(int[][] accounts) {

        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {

            int totalSum = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                totalSum = totalSum + accounts[i][j];
            }

            if (maxWealth < totalSum) {
                maxWealth = totalSum;
            }

        }


        return maxWealth;

    }

    public static void main(String[] args) {

        System.out.println(new CustomerWealth().maximumWealth(new int[][]{{1,2,3},{3,2,1}}));

    }
}
