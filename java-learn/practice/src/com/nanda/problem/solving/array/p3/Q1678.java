package com.nanda.problem.solving.array.p3;

public class Q1678 {

    public String interpret(String command) {

        return command.replaceAll("\\(\\)", "o").replaceAll("\\(al\\)","al");

    }

    public static void main(String[] args) {
        new Q1678().interpret("G()()()()(al)");
    }
}
