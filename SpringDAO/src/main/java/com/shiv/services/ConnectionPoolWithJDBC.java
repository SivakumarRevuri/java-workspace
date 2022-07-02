package com.shiv.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

public class ConnectionPoolWithJDBC {

	public static void main(String[] args) throws SQLException {
		
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/test");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		dataSource.setMaxActive(15);
		dataSource.setMaxIdle(5);
		dataSource.setMaxWait((long)1000*5);
		
		Connection connection = dataSource.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO student values(?,?,?,?)");
		preparedStatement.setLong(1, 2);
		preparedStatement.setString(2, "dummy");
		preparedStatement.setString(3, "dummy@hcl.com");
		preparedStatement.setString(4, "Bangalore");
		
		System.out.println("no of operations performed: "+ preparedStatement.executeUpdate());
		
		connection.close();
		preparedStatement.close();
	}
}
