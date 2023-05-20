package com.nanda.java.patterns.factory;

public class MySql implements Connector {
    @Override
    public String connection() {
        return "mysql connection";
    }

    @Override
    public void validate() {
        System.out.println("mysql data validation success");
    }
}
