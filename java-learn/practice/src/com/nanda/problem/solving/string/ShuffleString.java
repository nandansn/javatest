package com.nanda.problem.solving.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ShuffleString {

    public String restoreString(String s, int[] indices) {

        Map<Integer, String > table = new HashMap<>();

        StringBuilder sNew = new StringBuilder();

        for (int i = 0; i < indices.length; i++) {
            table.put(indices[i], String.valueOf(s.charAt(i)));
        }

        for (int i = 0; i < indices.length; i++) {
            sNew.append(table.get(i));
        }
        return new String(sNew);
    }

    public static void main(String[] args) {
        System.out.println(new ShuffleString().restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3}));
    }
}
