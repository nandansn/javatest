package com.nanda.java.patterns.factory;

public class ObjectStorage implements Connector {
    @Override
    public String connection() {
        return "oss connection";
    }

    @Override
    public void validate() {
        System.out.println("os validation success");
    }
}
