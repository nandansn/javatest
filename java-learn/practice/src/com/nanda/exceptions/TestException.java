package com.nanda.exceptions;

public class TestException {

    public static void main(String[] args) {


        try {
            int r = 10 / 0;

            System.out.println("nanda");

        } catch (ArithmeticException ae) {
            int k = 10/0;
            System.out.println("Division failed");
        } finally {
            System.out.println("finally");

        }

        System.out.println("done");



    }
}
