package com.nanda.problem.solving.interview;

import java.util.*;
import java.util.stream.Collectors;

public class MinimumuNumberOfCoins {

    static List<Integer> minPartition(int N) {
        List<Integer> coins = new ArrayList<>();

        List<Integer> denominations = getDenominations();

        boolean isMatch = denominations.contains(N);

        if (isMatch) {
            coins.add(N);
        } else {
            List<Integer> denomLess = denominations.stream().filter(d -> d < N).collect(Collectors.toList());

           helper(denomLess, N, coins);
        }


        return coins;

    }


    static List<Integer> helper(List<Integer> denoms, int N, List<Integer> coins) {



        int sum = coins.stream().reduce(0, (s,e) -> s + e);

        if (N == 0) {
            return coins;
        } else {
            int lastIndex = denoms.size() - 1;
            int currency = denoms.get(lastIndex);
            int counts = N / currency;

            for (int i = 0; i < counts; i++) {
                coins.add(currency);
            }

            int remaining = N - (currency * counts);
            denoms = denoms.stream().filter(e -> e <= remaining).collect(Collectors.toList());
            return helper(denoms, remaining, coins);
        }

    }

    static List<Integer> getDenominations() {
        List<Integer> denominations = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 5, 10, 20, 50, 100, 200, 500, 2000}));
        return denominations;
    }

    public static void main(String[] args) {
        MinimumuNumberOfCoins.minPartition(1000);
    }
}
