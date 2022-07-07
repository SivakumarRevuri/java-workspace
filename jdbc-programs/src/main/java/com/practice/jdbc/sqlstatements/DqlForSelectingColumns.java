package com.practice.jdbc.sqlstatements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.practice.jdbc.ConnectionSingleton;

public class DqlForSelectingColumns {

    public static void main(String[] args) {

	Connection connection = null;

	try {
	    connection = ConnectionSingleton.getConnection();
	    PreparedStatement pstmt = connection.prepareStatement("select username from user");
	    // for DQL statements only we use executeQuery() method
	    ResultSet resultSet = pstmt.executeQuery();
	    while (resultSet.next()) {
		String name = resultSet.getString(1);
		System.out.println("Name: " + name);
	    }
	    resultSet.close();
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
