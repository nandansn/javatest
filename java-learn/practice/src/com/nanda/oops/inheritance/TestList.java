package com.nanda.oops.inheritance;

import java.util.*;

public class TestList {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("nanda",20));
        personList.add(new Person("kanda",21));
        personList.add(new Person("manda",22));



       Person p =  Collections.max(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println(p.getName());
    }
}
