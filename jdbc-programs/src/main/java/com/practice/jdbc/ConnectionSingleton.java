package com.practice.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionSingleton {

    private static Connection connection;

    private ConnectionSingleton() {
	super();
    }

    public static Connection getConnection() {
	File file = new File("resources\\application.properties");
	FileInputStream inputStream;
	Properties connectionProperties = new Properties();
	try {
	    if (file.exists()) {
		inputStream = new FileInputStream(file);
		connectionProperties.load(inputStream);
	    }
	} catch (IOException e) {
	    e.printStackTrace();
	}

	try {
	    Class.forName(connectionProperties.getProperty("className"));
	    connection = DriverManager.getConnection(connectionProperties.getProperty("databaseurl"),
		    connectionProperties.getProperty("user"), connectionProperties.getProperty("password"));

	} catch (ClassNotFoundException | SQLException e) {
	    e.printStackTrace();
	}
	return connection;
    }

    @Override
    protected void finalize() {
	if (connection != null) {
	    try {
		connection.close();
	    } catch (SQLException e) {
		e.printStackTrace();
	    }
	}
    }
}
