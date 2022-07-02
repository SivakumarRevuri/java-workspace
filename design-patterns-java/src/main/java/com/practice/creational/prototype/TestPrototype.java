package com.practice.creational.prototype;

public class TestPrototype {

    public static void main(String[] args) throws CloneNotSupportedException {
	Employees employees = new Employees();
	employees.loadData();

	Employees tmp1 = (Employees) employees.clone();
	Employees tmp2 = (Employees) employees.clone();
	tmp1.getEmployeeList().add("Kalyan");
	tmp2.getEmployeeList().remove(0);
	System.out.println(employees.getEmployeeList());
	System.out.println(tmp1.getEmployeeList());
	System.out.println(tmp2.getEmployeeList());
    }

    /**
     * If the object cloning was not provided, we will have to make database call to
     * fetch the employee list every time. Then do the manipulations that would have
     * been resource and time consuming.
     */
}
