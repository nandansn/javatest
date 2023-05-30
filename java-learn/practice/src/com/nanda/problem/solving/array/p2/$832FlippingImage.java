package com.nanda.problem.solving.array.p2;

import java.util.Arrays;

public class $832FlippingImage {

    public int[][] flipAndInvertImage(int[][] image) {

        int[][] flippedImages = new int[image.length][image.length];


        for (int i = 0; i < image.length; i++) {
            int[] rev = new int[image[i].length];
            int index = 0;
            for (int j = image[i].length - 1; j >=0 ; j--) {

                flippedImages[i][index] = image[i][j] == 1 ? 0 : 1;
                ++index;

            }
        }

        return flippedImages;

    }

    public static void main(String[] args) {
        new $832FlippingImage().flipAndInvertImage(new int[][]{{1,1,0},{1,0,1},{0,0,0}});
    }
}
