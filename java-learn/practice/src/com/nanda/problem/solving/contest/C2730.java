package com.nanda.problem.solving.contest;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class C2730 {

    public int longestSemiRepetitiveSubstring(String s) {

        String[] nums = s.split("");

        Set<String> numSet = new TreeSet<>();

        int consecutiveFlag = 0;

        StringBuilder subString = new StringBuilder();

        int prevIndex = -1;

        for (int i = 0; i < nums.length; i++) {

            if (numSet.add(nums[i])) {
                subString.append(nums[i]);
            } else {
                if (nums[prevIndex].equals(nums[i])) {
//                    if (i >= 3) {
//                        if (nums[i].concat(nums[i-1]).equals(nums[i-2].concat(nums[i-3]))) {
//                            if (consecutiveFlag < 1) {
//                                subString.append(nums[i]);
//                                ++consecutiveFlag;
//                            } else {
//                                break;
//                            }
//                        } else {
//                            subString.append(nums[i]);
//                        }
//                    } else {
//                        subString.append(nums[i]);
//                    }

                    if (consecutiveFlag < 1) {
                        subString.append(nums[i]);
                        ++consecutiveFlag;
                    }

                } else {
                    subString.append(nums[i]);
                }
            }

            prevIndex = i;
        }


        //System.out.println(subString.toString().length());
        return subString.toString().length();
    }

    public static void main(String[] args) {
        new C2730().longestSemiRepetitiveSubstring("1101234883");
    }
}
