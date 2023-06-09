package com.nanda.problem.solving.array.p4;

import java.util.*;

public class Q2032 {

    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        Set<Integer> nums = new TreeSet<>();

        Set<Integer> numsSet = new TreeSet<>();


        nums1 = Arrays.stream(nums1).distinct().toArray();
        nums2 = Arrays.stream(nums2).distinct().toArray();
        nums3 = Arrays.stream(nums3).distinct().toArray();


        for (int i = 0; i < nums1.length; i++) {
               numsSet.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (!numsSet.add(nums2[i])){
                nums.add(nums2[i]);
            }
        }

        for (int i = 0; i < nums3.length; i++) {
            if (!numsSet.add(nums3[i])){
                nums.add(nums3[i]);
            }
        }




        return  new ArrayList<>(nums);

    }

    public static void main(String[] args) {
        new Q2032().twoOutOfThree(new int[]{1,2,2}, new int[]{4,3,3}, new int[]{5});
    }
}
