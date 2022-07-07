package com.practice.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.practice.jdbc.ConnectionSingleton;

public class AddBatchByPrepatedStatement {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Connection connection = null;
	try {
	    connection = ConnectionSingleton.getConnection();
	    PreparedStatement pstmt = connection.prepareStatement("insert into customer values(?,?,?) ");
	    System.out.println("enter the customer id");
	    pstmt.setInt(1, scanner.nextInt());
	    System.out.println("enter the customer name");
	    pstmt.setString(2, scanner.next());
	    System.out.println("enter the balance");
	    pstmt.setDouble(3, scanner.nextDouble());
	    pstmt.addBatch();
	    System.out.println("enter the customer id");
	    pstmt.setInt(1, scanner.nextInt());
	    System.out.println("enter the customer name");
	    pstmt.setString(2, scanner.next());
	    System.out.println("enter the customer balance");
	    pstmt.setDouble(3, scanner.nextDouble());
	    pstmt.addBatch();
	    int[] rs = pstmt.executeBatch();
	    for (int i = 1; i < rs.length; i++) {
		System.out.print(i);
	    }
	} catch (SQLException e) {
	    e.printStackTrace();
	} finally {
	    if (connection != null) {
		try {
		    connection.close();
		    scanner.close();
		    connection = null;
		} catch (SQLException e) {
		    e.printStackTrace();
		}

	    }
	}
    }
}
