package com.nanda.exceptions;

public class TestExceptionPrority {

    public static void main(String[] args) {

        while (true) {

            try {
                System.out.println("try");

                if (100 < 20) {
                    break;
                } else {

                    throw new RuntimeException();

                }

            } catch (Exception e) {
                System.out.println("catch");

            } finally {
                System.out.println("finally");
                break;

            }
        }
    }
}
