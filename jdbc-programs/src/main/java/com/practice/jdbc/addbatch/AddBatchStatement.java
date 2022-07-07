package com.practice.jdbc.addbatch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.practice.jdbc.ConnectionSingleton;

public class AddBatchStatement {

    public static void main(String[] args) {

	Connection connection = null;
	try {
	    connection = ConnectionSingleton.getConnection();
	    PreparedStatement statement = connection.prepareStatement("insert into user values(?,?,?,?)");
	    statement.setString(1, "bhanu");
	    statement.setInt(2, 7);
	    statement.setString(3, "9502625238");
	    statement.setDouble(4, 0);
	    // addBatch() helps to execute multiple statements in single time.
	    statement.addBatch();
	    // Executing all the statements using executeBatch() and returns int[] as output
	    int[] a = statement.executeBatch();
	    for (int i = 0; i < a.length; i++) {
		System.out.print(i + "  ");
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
