package com.nanda.oops.inheritance;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {
    static int x = 10;

    public void m1(String s) {
        System.out.println("string");
    }

    public void m1(StringBuffer s) {
        System.out.println("object");
    }

    public static void main(String[] args) {
        Browser chrome = new Chrome("google-chrome","www.nanda.com");
        chrome.open();
        chrome.forward();

        new Test().m1("string");

        System.out.println(x);


        try {
           FileReader fr = new FileReader("nanda.txt");
           int i;
           while((i =fr.read()) != -1) {
               System.out.println((char)i);
           }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
