package com.nanda.java.patterns.factory;

public class Oracle implements Connector {
    @Override
    public String connection() {
        return "orcale connection";
    }

    @Override
    public void validate() {
        System.out.println("oracle data validation success");
    }
}
