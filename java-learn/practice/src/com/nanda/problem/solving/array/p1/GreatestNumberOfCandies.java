package com.nanda.problem.solving.array.p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {


        List<Boolean> booleanList = new ArrayList<>(candies.length);

        int max = Arrays.stream(candies).max().getAsInt();


        for (int i = 0; i < candies.length; i++) {

            if ((candies[i] + extraCandies) >= max) {
                    booleanList.add(true);
            } else {
                booleanList.add(false);
            }

        }



        return booleanList;



    }

    public static void main(String[] args) {
        new GreatestNumberOfCandies().kidsWithCandies(new int[]{2,3,5,1,3},3);
    }
}
