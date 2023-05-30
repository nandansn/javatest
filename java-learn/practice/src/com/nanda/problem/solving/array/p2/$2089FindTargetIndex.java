package com.nanda.problem.solving.array.p2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $2089FindTargetIndex {


    public List<Integer> targetIndices(int[] nums, int target) {

        List<Integer> targets = new ArrayList<>();


        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {
                targets.add(i);
            }
        }


        return targets;

    }

    public static void main(String[] args) {

    }
}
