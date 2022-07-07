package com.practice.jdbc.sqlstatements;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.practice.jdbc.ConnectionSingleton;
import com.practice.jdbc.model.Student;

public class InsertionStatement {

    public static void main(String[] args) {

	Connection con = null;
	try {
	    // establish a connection
	    con = ConnectionSingleton.getConnection();
	    // create a platform
	    Statement stmt = con.createStatement();
	    // execute a statement
	    ArrayList<Student> lst = studentEntry();
	    for (Student st : lst) {
		String sql = "insert into oracle.user values('" + st.getName() + " ''" + st.getAge() + " '+'"
			+ st.getPhone() + " ')";
		stmt.execute(sql);
	    }
	} catch (SQLException e) {
	    e.printStackTrace();
	} finally {
	    if (con != null) {
		try {
		    con.close();
		} catch (SQLException e) {
		    e.printStackTrace();
		}
	    }
	}
    }

    public static ArrayList<Student> studentEntry() {

	Scanner scanner = new Scanner(System.in);
	Student student = new Student();
	boolean isTrue = Boolean.TRUE;
	ArrayList<Student> alst = new ArrayList<>();
	while (isTrue) {
	    System.out.println("enter the student name,age and phone");
	    student.setName(scanner.nextLine());
	    student.setAge(scanner.nextInt());
	    student.setPhone(scanner.next());
	    alst.add(student);
	    System.out.println("do you want to proceed with new entry y/n");
	    if (scanner.next().equals("n")) {
		isTrue = Boolean.FALSE;
	    }
	}
	scanner.close();
	return alst;
    }
}
