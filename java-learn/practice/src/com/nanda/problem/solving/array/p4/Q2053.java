package com.nanda.problem.solving.array.p4;

import java.util.*;

public class Q2053 {


    class Code {
        int pos;
        int count;

        public Code(int pos, int count) {
            this.pos = pos;
            this.count = count;
        }
    }

    public String kthDistinct(String[] arr, int k) {



        List<String> distincts = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            final String el = arr[i];
            long count = Arrays.asList(arr).stream().filter(e -> e.equals(el)).count();
            if (count == 1) {
                distincts.add(arr[i]);
            }
        }

       if (k > distincts.size()){
           return "";
       } else {
           return distincts.get(k-1);
       }



    }

    public static void main(String[] args) {
        new Q2053().kthDistinct(new String[]{"d","b","c","b","c","a"}, 3);
    }
}
