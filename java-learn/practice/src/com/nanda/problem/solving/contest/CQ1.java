package com.nanda.problem.solving.contest;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CQ1 {

    public boolean isFascinating(int n) {

        String value = String.valueOf(n);
        if (value.charAt(0) == '0' || value.charAt(1) == '0' || value.charAt(2) == 0) {
            return false;
        } else {
            String result = String.valueOf(n) + String.valueOf(n * 2).concat(String.valueOf(n * 3));

            Map<Character,Integer> map = new ConcurrentHashMap<>();

            for (int i = 0; i < result.length(); i++) {

                Character key = result.charAt(i);

                if (map.containsKey(key)) {
                    int count = map.get(key);
                    map.put(result.charAt(i), ++count);
                } else {
                    map.put(key, 1);
                }

            }


            if (map.size() > 9){
                return false;
            } else {
                for (int i = 1; i < 10; i++) {

                    char c = (char)(i+'0');

                    System.out.println(c);

                    if (map.get(c) == null || map.get(c) != 1) {
                        return false;
                    }
                }
            }
        }

        return true;

    }


    public static void main(String[] args) {
        new CQ1().isFascinating(111);
    }
}
