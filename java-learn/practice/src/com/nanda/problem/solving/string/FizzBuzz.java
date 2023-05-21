package com.nanda.problem.solving.string;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzz(int n) {

        List<String> result = new ArrayList<>();

        int index = 1;

        while (index <= n) {

            if (index < 3) {
                result.add(String.valueOf(index));
            } else {

                if (index % 3 == 0 && index % 5 == 0) {
                    result.add("FizzBuzz");
                } else if (index % 3 == 0) {
                    result.add("Fizz");
                } else if (index % 5 == 0) {
                    result.add("Buzz");
                } else {
                    result.add(String.valueOf(index));
                }

            }
            index += 1;
        }


        return result;

    }

    public static void main(String[] args) {
        System.out.println(new FizzBuzz().fizzBuzz(5));
    }
}
