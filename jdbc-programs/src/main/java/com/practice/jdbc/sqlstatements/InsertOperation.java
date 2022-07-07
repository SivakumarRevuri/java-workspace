package com.practice.jdbc.sqlstatements;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.practice.jdbc.ConnectionSingleton;
import com.practice.jdbc.model.User;

public class InsertOperation {

    public void addUsers(List<User> users) {
	Connection connection = null;
	try {
	    connection = ConnectionSingleton.getConnection();
	    Statement stmt = connection.createStatement();
	    for (User user : users) {
		String sql = "insert into m_jdbc.user values(' " + user.getName() + " ',''" + user.getAge() + " ',"
			+ user.getPhone() + "," + user.getName() + " ' ) ";
		stmt.addBatch(sql);
	    }
	    int[] a = stmt.executeBatch();
	    for (int i : a) {
		System.out.println(i);
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

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	ArrayList<User> list = new ArrayList<>();
	int user_option = 1;
	while (user_option == 1) {
	    User u = new User();
	    System.out.println("enter user name");
	    u.setName(scanner.next());
	    System.out.println("enter user age");
	    u.setAge(scanner.nextInt());
	    System.out.println("enter user salary");
	    u.setSal(scanner.nextDouble());
	    System.out.println("enter user contactNo");
	    u.setPhone(scanner.next());
	    list.add(u);
	    System.out.println("if you want to enter the data again enter 1");
	    user_option = scanner.nextInt();
	}
	new InsertOperation().addUsers(list);
	scanner.close();
    }
}
