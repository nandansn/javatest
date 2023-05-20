package com.nanda.problem.solving;

import java.util.Arrays;
import java.util.Comparator;

public class Temperature {

    static double closestToZero(double[] ts) {

        double tempCloseToZero = 0;

        if (ts.length == 0) {
            return tempCloseToZero;
        } else if (ts.length == 1){
            tempCloseToZero = ts[0];
            return tempCloseToZero;
        } else {
            Arrays.sort(ts);
            if (ts[0] < 0) {
                ts[0] = ts[0] * - 1;
            }
            tempCloseToZero = ts[0];
            for (double t : ts) {
               // System.out.println(t);
                if (t < 0) {
                    t = t * -1;
                }
                tempCloseToZero = ( t - 0 < tempCloseToZero ) ? t : tempCloseToZero;
            }
        }


        return tempCloseToZero;
    }

    public static void main(String[] args) {

        double[] ts =
                {7,-10,13,8,4,-7.2,-12,-3.7,3.5,-9.6,6.5,-1.7,-6.2,7,1.7};

        double result = closestToZero(ts);

        System.out.println("Result: " + result);

    }
}
