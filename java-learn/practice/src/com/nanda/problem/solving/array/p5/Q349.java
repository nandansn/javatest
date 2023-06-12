package com.nanda.problem.solving.array.p5;

import java.util.*;

public class Q349 {

    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> unique1 = new TreeSet<>();

        for (int num: nums1) {
            unique1.add(num);
        }

        Set<Integer> unique2 = new TreeSet<>();

        for(int num: nums2) {
           unique2.add(num);
        }

        List<Integer> numResults = new ArrayList<>();

        if (unique2.size() < unique1.size()) {
            for (Integer num : unique2) {
                if (unique1.contains(num)) {
                    numResults.add(num);
                }
            }
        } else {
            for (Integer num : unique1) {
                if (unique2.contains(num)) {
                    numResults.add(num);
                }
            }
        }



       return numResults.stream().mapToInt(obj -> (int)obj).toArray();

    }

    public static void main(String[] args) {
        new Q349().intersection(new int[]{1,2,2,1}, new int[]{2,2});
    }
}
