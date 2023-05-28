package com.nanda.problem.solving.array.p1;

import java.util.HashMap;
import java.util.Map;

public class FinalValueAfterOpr {

    public int finalValueAfterOperations(String[] operations) {

        int finalValue = 0;

        Map<String, Integer> mapper = new HashMap<>();

        mapper.put("++X",1);
        mapper.put("X++",1);
        mapper.put("--X",-1);
        mapper.put("X--",-1);

        for (int i = 0; i < operations.length; i++) {

            finalValue = finalValue + mapper.get(operations[i]);
        }



        return finalValue;

    }

    public static void main(String[] args) {


        new FinalValueAfterOpr().finalValueAfterOperations(new String[]{"--X","X++","X++"});

    }
}
