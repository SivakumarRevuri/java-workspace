package com.practice.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.practice.jdbc.ConnectionSingleton;

public class DeleteRecordByPreparedStatement {

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	Connection connection = null;
	try {

	    connection = ConnectionSingleton.getConnection();
	    // create a platform
	    PreparedStatement pstmt = connection.prepareStatement("delete from  m_jdbc.user where name=? ");
	    System.out.println("enter the user name");
	    pstmt.setString(1, scanner.nextLine());

	    // execute a statement
	    int a = pstmt.executeUpdate();
	    System.out.println(a);

	} catch (SQLException e) {
	    e.printStackTrace();
	} finally {
	    if (connection != null) {
		try {
		    scanner.close();
		    connection.close();
		} catch (SQLException e) {
		    e.printStackTrace();
		}
	    }
	}
    }
}
