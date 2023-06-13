package com.nanda.problem.solving.array.p5;

import java.util.ArrayList;
import java.util.List;

public class Q2194 {

    public List<String> cellsInRange(String s) {

        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";



        int rowStartIndex = Integer.parseInt(s.substring(1,s.indexOf(":")));
        int rowEndIndex = Integer.parseInt(s.substring(s.indexOf(':')+2));

        String startColumn = s.substring(0,1);

        String endColumn = s.substring(s.indexOf(":")+1,s.indexOf(":")+2);

        int endColumnIndex = letters.indexOf(endColumn);
        int startColumnIndex = letters.indexOf(startColumn);


        List<String> result = new ArrayList<>();


        for (int i = startColumnIndex; i <= endColumnIndex; i++) {


            String letter = String.valueOf(letters.charAt(i));

            for (int j = rowStartIndex; j <= rowEndIndex; j++) {
                result.add(letter+j);
            }

        }




        return result;

    }


    public static void main(String[] args) {
         new Q2194().cellsInRange( "A1:F1");
    }
}
