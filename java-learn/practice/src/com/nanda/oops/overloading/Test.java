package com.nanda.oops.overloading;

import java.util.Arrays;

public class Test {


    public void m1(int a) {
        System.out.println(a);
    }

    public void m2(float f) {
        System.out.println(f);
    }


    public void m1(String s) {
        System.out.println(s);
    }

//    public void m1(StringBuilder s){
//
//    }

    public void m1(Object o) {
        System.out.println("object");

        new String("").hashCode();
    }

    public int m1(int ...x) {

        System.out.println(x);

        return 1;
    }


    public void m1(Animal a) {
        System.out.println("animal");
    }

    public void  m1(Monkey m) {
        System.out.println("monkey");
    }








    public static void main(String[] args) {


        Test t = new Test();
        t.m1("nanda");
        t.m1(new StringBuilder("kumar"));
        t.m1(10);


        Animal a = new Monkey();
        t.m1(a);

    }
}

class Animal {

}

class Monkey extends Animal {

}
