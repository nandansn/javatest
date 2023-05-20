package com.nanda.threads;

public class CounterService {
    public static void main(String[] args) {
        Counter c = new Counter();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);
        Thread t4 = new Thread(c);
        Thread t5 = new Thread(c);
        Thread t6 = new Thread(c);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();



        for (int i = 0; i <5 ; i++) {

            Thread t = new Thread(c);
            t.start();

        }

    }
}
