package com.nanda.java.patterns.singleton;

public class DBConnection {

    private static DBConnection dbConnection = new DBConnection();

    private DBConnection() {

    }

    public static DBConnection  getInstance() {
        if (dbConnection == null) {
            synchronized (DBConnection.class) {
                if (dbConnection == null) {
                    dbConnection = new DBConnection();

                }
                return dbConnection;
            }
        } else {
            return dbConnection;
        }

    }
}
