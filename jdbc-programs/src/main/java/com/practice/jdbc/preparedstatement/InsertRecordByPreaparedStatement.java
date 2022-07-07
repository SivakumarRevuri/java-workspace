package com.practice.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.practice.jdbc.ConnectionSingleton;

public class InsertRecordByPreaparedStatement {

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	Connection connection = null;
	try {
	    connection = ConnectionSingleton.getConnection();
	    String sql = "insert into m_jdbc.user values (?,?,?,?)";
	    PreparedStatement pstmt = connection.prepareStatement(sql);
	    System.out.println("enter user name");
	    pstmt.setString(1, scanner.next());
	    System.out.println("enter the age");
	    pstmt.setInt(2, scanner.nextInt());
	    System.out.println("enter the phone number");
	    pstmt.setString(3, scanner.next());
	    System.out.println("enter the salary");
	    pstmt.setString(4, scanner.next());

	    int a = pstmt.executeUpdate();
	    System.out.println("your query updated when it show one:   " + a);
	    
	} catch (SQLException e) {
	    e.printStackTrace();
	} finally {
	    if (connection != null) {
		try {
		    connection.close();
		    scanner.close();
		} catch (SQLException e) {
		    e.printStackTrace();
		}
	    }
	}

    }
}
