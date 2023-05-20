package com.nanda.java.patterns.builder;


public class TestMain {
    public static void main(String[] args) {
        Person person = new PersonRequest.Builder().name("nanda").age(34).mobileNumber(38093).build();
        System.out.println(person.getName());
    }
}
