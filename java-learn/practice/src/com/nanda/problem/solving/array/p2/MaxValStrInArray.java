package com.nanda.problem.solving.array.p2;

public class MaxValStrInArray {

    public int maximumValue(String[] strs) {

        int maxValue =0;



        String pattern = "\\d+";
        for (int i = 0; i < strs.length; i++) {

            int value = 0;

            if (strs[i].matches(pattern)) {
                value = Integer.parseInt(strs[i]);
            } else {
                value = strs[i].length();
            }

            if (value > maxValue) {
                maxValue = value;
            }
        }


        return maxValue;

    }

    public static void main(String[] args) {
        new MaxValStrInArray().maximumValue(new String[]{"3glko","1"});
    }
}
