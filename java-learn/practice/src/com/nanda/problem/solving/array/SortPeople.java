package com.nanda.problem.solving.array;

import java.util.*;

public class SortPeople {


    class Person implements Comparable<Person> {
        private String name;
        private int height;

        public Person(String name, int height) {
            this.name = name;
            this.height = height;
        }


        @Override
        public int compareTo(Person o) {
            return o.height - this.height;
        }
    }


    public String[] sortPeople(String[] names, int[] heights) {


        List<Person> sortedSet = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            sortedSet.add(new Person(names[i], heights[i]));

        }

        Collections.sort(sortedSet);
        int index = 0;
        String[] sortedPersons = new String[names.length];
        for (Person p : sortedSet) {
            sortedPersons[index++] = p.name;
        }

        return sortedPersons;

    }

    public static void main(String[] args) {

        new SortPeople().sortPeople(new String[]{"Mary", "John", "Emma"}, new int[]{180, 165, 165});

    }
}
