package com.nanda.problem.solving.array.p3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QN9 {

    public boolean isPalindrome(int x) {



        boolean isPalindrome = false;

       if (x < 0) {
          isPalindrome = false;
       } else {

           List<Integer> nums = new ArrayList<>();
           int copyOfX = x;

           do {
               int re = copyOfX % 10;
               nums.add(re);
               copyOfX = copyOfX / 10;
           } while (copyOfX > 0);

           int rev = nums.stream().reduce(0, (a, c) ->  (a * 10) + c );


           if (rev == x) {
               return true;
           } else {
               return false;
           }


//           for (int i = 0; i < nums.size(); i++) {
//               if (nums.get(i) != Collections.reverse(nums))
//           }

       }




        return isPalindrome;


    }

    public static void main(String[] args) {
        new QN9().isPalindrome(121);
    }
}
