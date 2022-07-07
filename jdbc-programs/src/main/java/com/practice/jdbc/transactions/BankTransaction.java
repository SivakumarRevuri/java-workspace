package com.practice.jdbc.transactions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.practice.jdbc.ConnectionSingleton;
import com.practice.jdbc.exceptions.custom.InSuffientBalanceExection;
import com.practice.jdbc.model.Customer;

public class BankTransaction {

    public static void main(String[] args) {
	double bal = 0;
	Scanner scanner = new Scanner(System.in);
	Customer customer = new Customer();
	System.out.println("enter the debiter id");
	customer.setCustomerId(scanner.nextInt());
	System.out.println("enter the receiver id");
	customer.setSenderId(scanner.nextInt());
	System.out.println("enter the transfer amount");
	customer.setAmount(scanner.nextDouble());
	Connection connection = null;
	try {
	    connection = ConnectionSingleton.getConnection();
	    PreparedStatement preparedStatement = connection
		    .prepareStatement("select bal from m_jdbc.customer where cid=?");
	    preparedStatement.setInt(1, customer.getCustomerId());
	    ResultSet resultSet = preparedStatement.executeQuery();

	    if (resultSet.next()) {
		double d = resultSet.getDouble(1);
		bal = d;
	    }
	    if (bal >= (1000 + customer.getAmount())) {

		// transaction begins
		connection.setAutoCommit(false);
		String sql = "update m_jdbc.customer set bal=bal-" + "" + customer.getAmount() + "" + " where cid=" + ""
			+ customer.getCustomerId() + "";
		String sql1 = "update m_jdbc.customer set bal=bal+" + "" + customer.getAmount() + "" + " where cid=" + ""
			+ customer.getSenderId() + "";
		String sql2 = "insert into m_jdbc.transaction values(1,'credit'," + customer.getAmount() + ")";
		String sql3 = "insert into m_jdbc.transaction values(2,'debit'," + customer.getAmount() + ")";
		Statement stmt = connection.createStatement();
		stmt.addBatch(sql);
		stmt.addBatch(sql1);
		stmt.addBatch(sql2);
		stmt.addBatch(sql3);
		int[] a = stmt.executeBatch();

		// we are commit here
		connection.commit();
		for (int i = 0; i < a.length; i++) {
		    System.out.print(a[i] + "  ");
		}
	    } else {
		System.out.println("current balance:  " + bal);
		throw new InSuffientBalanceExection();
	    }
	} catch (InSuffientBalanceExection e) {
	    System.out.println(e);
	}

	catch (SQLException e) {
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
