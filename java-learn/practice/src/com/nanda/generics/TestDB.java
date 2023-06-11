package com.nanda.generics;

public class TestDB {

    public static void main(String[] args) {
        DbValidator<Target> dbDbValidator = new DbValidator<>();
        dbDbValidator.validate(new Oracle("oracle","ora","oracle url"));
        dbDbValidator.validate(new MySql("oracle","ora","oracle url"));
        dbDbValidator.validate(new Oracle("oracle","ora123","oracle url"));
    }
}

interface Target {

    public void openConnection();
    public void closeConnection();

    public void query();
}

class Oracle implements Target {

    String username;
    String password;
    String url;

    public Oracle(String username, String password, String url) {
        this.username = username;
        this.password = password;
        this.url = url;
    }



    @Override
    public void openConnection() {
        System.out.println("oracle connection open:"+this.username);
    }

    @Override
    public void closeConnection() {
        System.out.println("oracle connection close:"+this.username);
    }

    @Override
    public void query() {
        System.out.println("oracle records queried");
    }
}

class MySql implements Target {

    String username;
    String password;
    String url;


    public MySql(String username, String password, String url) {
        this.username = username;
        this.password = password;
        this.url = url;
    }

    @Override
    public void openConnection() {
        System.out.println("my sql connection"+this.username);
    }

    @Override
    public void closeConnection() {

    }

    @Override
    public void query() {

    }
}


class DbValidator<T extends Target> {



    public void validate(T t) {
        t.openConnection();
        t.query();
        t.closeConnection();
    }
}
