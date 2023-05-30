package com.nanda.problem.solving.array.p2;

public class $1450HomeWork {

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {

        int count = 0;

        for (int i = 0; i < startTime.length; i++) {
            if (queryTime >= startTime[i] && queryTime <= endTime[i]) {
                ++count;
            }
        }

        return count;

    }

    public static void main(String[] args) {
        new $1450HomeWork().busyStudent(new int[]{4}, new int[]{4}, 4);
    }
}
