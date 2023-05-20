package com.nanda.java.patterns.factory;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

    public static void main(String[] args) {
        List<ConnectorFactory.Connection> connections = new ArrayList<>();

        connections.add(ConnectorFactory.Connection.ORACLE);
        connections.add(ConnectorFactory.Connection.OS);
        connections.add(ConnectorFactory.Connection.MYSQL);

        connections.forEach(connection -> {
            Connector connector = ConnectorFactory.getConnector(connection);
            System.out.println(connector.connection());
            connector.validate();
        });
    }
}
