package com.practice.jdbc.sqlstatements;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.practice.jdbc.ConnectionSingleton;

public class SelectStatement {

    public static void main(String[] args) {

	Connection connection = null;

	try {
	    connection = ConnectionSingleton.getConnection();
	    Statement statement = connection.createStatement();
	    // for DQL statements only we use
	    // executeQuery() method and it returns ResultSet
	    ResultSet rs = statement.executeQuery("select * from m_jdbc.user");
	    while (rs.next()) {
		String name = rs.getString(1);
		int age = rs.getInt(2);
		String phone = rs.getString(3);
		double sal = rs.getDouble(4);

		System.out.println("name: " + name + "  age:  " + age + "  phone:  " + phone + "  sal:  " + sal);
	    }

	} catch (SQLException e) {
	    e.printStackTrace();
	} finally {
	    if (connection != null) {
		try {
		    connection.close();
		} catch (SQLException e) {
		    e.printStackTrace();
		}
	    }
	}
    }
}
