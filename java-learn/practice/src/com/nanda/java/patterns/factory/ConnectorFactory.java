package com.nanda.java.patterns.factory;

import java.util.HashMap;

public class ConnectorFactory {

    enum Connection {
        MYSQL,
        ORACLE,
        OS,
    }

    static HashMap<Connection, Connector> map = new HashMap<>();

    static {

        map.put(Connection.MYSQL,new MySql());
        map.put(Connection.ORACLE, new Oracle());
        map.put(Connection.OS, new ObjectStorage());
    }

    public static Connector getConnector(Connection connection) {
        return map.get(connection);
    }
}
