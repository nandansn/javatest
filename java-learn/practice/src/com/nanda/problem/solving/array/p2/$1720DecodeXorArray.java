package com.nanda.problem.solving.array.p2;

public class $1720DecodeXorArray {

    public int[] decode(int[] encoded, int first) {

        int[] decoded = new int[encoded.length+1];
        decoded[0] = first;
        for (int i = 0; i < encoded.length; i++) {
//            if (encoded[i] == 0) {
//                decoded[i+1] = encoded[i];
//                first = decoded[i+1];
//            } else if (encoded[i] == first) {
//                decoded[i+1] = 0;
//                first = 0;
//            } else {

                int s = 0;
                while (true) {
                    int decode = first ^ s;
                    if (decode == encoded[i]) {
                        decoded[i + 1] = s;
                        first = s;
                        break;
                    } else {
                        ++s;
                    }
                }
            }


        return decoded;

    }

    public static void main(String[] args) {
        new $1720DecodeXorArray().decode(new int[]{0,0,5,3}, 7);
    }
}
