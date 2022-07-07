package com.practice.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.practice.jdbc.ConnectionSingleton;

public class InsertRecordByExecuteMethod {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Connection connection = null;
	try {
	    connection = ConnectionSingleton.getConnection();
	    String sql = "insert into m_jdbc.employee values(?,?,?,?)";// insert query
	    PreparedStatement pstmt = connection.prepareStatement(sql);// platform creation using PreparedStatement
	    System.out.println("enter employee id");
	    pstmt.setInt(1, scanner.nextInt());
	    System.out.println("enter employee name");
	    pstmt.setString(2, scanner.next());
	    System.out.println("enter employee age");
	    pstmt.setInt(3, scanner.nextInt());
	    System.out.println("enter employee sal");
	    pstmt.setDouble(4, scanner.nextDouble());

	    boolean b = pstmt.execute();
	    System.out.println(b);
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
