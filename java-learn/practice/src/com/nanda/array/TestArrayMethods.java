package com.nanda.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;

public class TestArrayMethods {

    public static void main(String[] args) {
        String[] names = {"nanda","kan","bandakk"};

        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        System.out.println(names);

        IntConsumer d = System.out::println;

        int[] nums = new int[10];

        Arrays.setAll(nums, (index) -> index * 2);



        Arrays.stream(nums).forEach(d);


    }
}


@FunctionalInterface
interface Display {
    public void display();
}