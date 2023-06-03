package com.nanda.problem.solving.string.p2;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Q771 {

    public int numJewelsInStones(String jewels, String stones) {

        int count = 0;

        String re = Arrays.stream(jewels.split("")).collect(Collectors.joining("|"));


        Pattern pattern = Pattern.compile(re);

        Matcher matcher = pattern.matcher(stones);

        while (matcher.find()) {
            ++count;
        }


        return count;

    }

    public static void main(String[] args) {

        new Q771().numJewelsInStones("ngm", "kxg");

    }
}
