package com.nanda.oops.inheritance;

public abstract class Browser {


    private String url;

    public Browser(String url) {
        this.url = url;
    }


    public void open() {
        System.out.println(String.format("browser opened the page %s",this.url));
    }

    void forward() {
        System.out.println("forward");
    }

    abstract void devTools();
}
