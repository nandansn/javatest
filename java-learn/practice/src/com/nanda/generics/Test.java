package com.nanda.generics;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Test<T extends Page> {

    public static void main(String[] args) {
        List<Page> pages = new ArrayList<Page>();

        pages.add(new Page());
        pages. add(new LoginPage());


        Operations<OracleDB> oracle = new Operations<>();
        oracle.open(new OracleDB("nanda","1234","url"));

        Operations<MySqlDB> mysql = new Operations<>();
        mysql.open(new MySqlDB("mysql","456","url"));

        System.out.println("end");


    }
}





interface Connection {

    public void open();
    public void close();


}

interface Query extends Connection {
    public void records();
}

abstract class DB implements Query {

}

class OracleDB extends DB {

    String username;
    String password;

    String url;

    public OracleDB(String username, String password, String url) {
        this.username = username;
        this.password = password;
        this.url = url;
    }

    @Override
    public String toString() {
        return "OracleDB{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                '}';
    }




    @Override
    public void open() {
        System.out.println("oracle connection opened");
        System.out.println(this.toString());
    }

    @Override
    public void close() {

    }

    @Override
    public void records() {

    }
}

class MySqlDB extends DB {

    String username;
    String password;

    String url;

    public MySqlDB(String username, String password, String url) {
        this.username = username;
        this.password = password;
        this.url = url;
    }

    @Override
    public String toString() {
        return "MySqlDB{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    @Override
    public void open() {
        System.out.println(this.toString());
    }

    @Override
    public void close() {

    }

    @Override
    public void records() {

    }
}

class Operations<T extends DB> {


    public void open(T t) {
        t.open();
    }


}

class Page {

}
class LoginPage extends Page {

}
