package com.nanda.problem.solving.array.p2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Q2363 {


    public class ValueWeight {

        private int value;
        private int weight;

        public ValueWeight(int[] item) {
            this.value = item[0];
            this.weight = item[1];
        }

        @Override
        public boolean equals(Object obj) {
            return this.value == ((ValueWeight) obj).value;
        }

    }

    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> mergedList = new ArrayList<>();

        List<ValueWeight> list1 = new ArrayList<>();

        for (int i = 0; i < items1.length; i++) {
            list1.add(new ValueWeight(items1[i]));
        }

        List<ValueWeight> list2 = new ArrayList<>();

        for (int i = 0; i < items2.length; i++) {
            list2.add(new ValueWeight(items2[i]));
        }


        for (int i = 0; i < list1.size(); i++) {
            List<Integer> values = new ArrayList<>();
            if (list2.contains(list1.get(i))) {
                int index = list2.indexOf(list1.get(i));
                values.add(list1.get(i).value);
                values.add(list1.get(i).weight + list2.get(index).weight);
                mergedList.add(values);
            } else {
                values.add(list1.get(i).value);
                values.add(list1.get(i).weight);
                mergedList.add(i, values);
            }
        }

        for (int i = 0; i < list2.size(); i++) {
            List<Integer> values = new ArrayList<>();
            if (!list1.contains(list2.get(i))) {
                values.add(list2.get(i).value);
                values.add(list2.get(i).weight);
                mergedList.add(i, values);
            }

        }

        Collections.sort(mergedList, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> integers, List<Integer> t1) {
                return integers.get(0) - t1.get(0);
            }
        });


        return mergedList;
    }

    public static void main(String[] args) {
        new Q2363().mergeSimilarItems(new int[][]{{1, 1}, {4, 5}, {3, 8}}, new int[][]{{3, 1}, {1, 5}});
    }


}

