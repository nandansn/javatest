package com.nanda.problem.solving.array.p1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UniqueNumOccurence {

    public boolean uniqueOccurrences(int[] arr) {
        
        boolean isUnique = true;
        
        Map<Integer, Integer> occurenceMap = new HashMap<>();


        for (int i = 0; i < arr.length; i++) {
             if (occurenceMap.putIfAbsent(arr[i], 1) != null) {
                 int count = occurenceMap.get(arr[i]);
                 occurenceMap.put(arr[i], ++count);
             }
        }

        isUnique = Arrays.stream(occurenceMap.values().toArray()).distinct().count() != occurenceMap.values().size() ? false : true;

        
        return  isUnique;

    }

    public static void main(String[] args) {
        new UniqueNumOccurence().uniqueOccurrences(new int[]{1,2});
    }
}
