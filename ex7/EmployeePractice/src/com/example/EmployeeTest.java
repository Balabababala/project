package com.example;

import com.example.domain.Employee;

public class EmployeeTest {
	public static void main(String args[]) {
		String a=null;
		Employee emp = new Employee("Sean", "A123456789", 5000);
		emp.displayInformation();
		emp.setName("main");
		emp.displayInformation();
		emp.raiseSalary(300);
		emp.displayInformation();
		Employee emp2 = new Employee(" ", "A123456789", 114514);
		emp2.displayInformation();
	}
}
