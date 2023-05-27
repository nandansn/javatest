package com.nanda.map;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

    public static void main(String[] args) {


        Map<Integer, String> phoneName = new HashMap<>();




        System.out.println(phoneName.getOrDefault(101, "kumar"));

    }
}
