package com.nanda.oops.inheritance;

public class Chrome extends Browser {

    private String name;

    public  Chrome(String name, String url) {
        super(url);
        this.name = name;
    }

    public void detailsOfChrome() {
        System.out.println(this.getClass().getCanonicalName());
    }

    @Override
    protected void forward() {
//        super.forward();
        System.out.println("chrome forward");
    }

    @Override
    void devTools() {

    }
}
