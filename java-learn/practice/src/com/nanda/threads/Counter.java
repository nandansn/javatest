package com.nanda.threads;

public class Counter implements Runnable {

    private int count;

    public Counter() {

    }

    public void increment() {
       synchronized (Counter.class){
            this.count = this.count + 1;
            System.out.println(this.getCount());
        }

    }

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        this.increment();
    }
}
