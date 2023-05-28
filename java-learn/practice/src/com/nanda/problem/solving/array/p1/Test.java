package com.nanda.problem.solving.array.p1;

public class Test {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for (String word : words) {
            if (s.startsWith(word)) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        new Test().countPrefixes(new String[]{"feh","w","w","lwd","c","s","vk","zwlv","n","w","sw","qrd","w","w","mqe","w","w","w","gb","w","qy","xs","br","w","rypg","wh","g","w","w","fh","w","w","sccy"},"w");
    }
}
