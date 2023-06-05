package com.nanda.problem.solving.array.p3;

public class Q1108 {

    public String defangIPaddr(String address) {

        return address.replaceAll("\\.", "[.]");

    }


    public static void main(String[] args) {

        new Q1108().defangIPaddr("1.1.1.1");

    }
}
