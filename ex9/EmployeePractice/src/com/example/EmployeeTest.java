package com.example;

import com.example.domain.*;

public class EmployeeTest {
	public static void main(String args[]) {
		Employee emps[]=new Employee[5];

		emps[0] = new Employee("Sean", "A123456789", 50000);

		emps[1] = new Admin("Admin", "A123456789", 500000);

		emps[2] = new Engineer ("Engineer", "A123456789", 5000000);
		((Engineer)emps[2]).addSkill("JAVA");
		((Engineer)emps[2]).addSkill("Android");
		((Engineer)emps[2]).addSkill("JAVA");
		((Engineer)emps[2]).addSkill("Android");


		emps[3] = new Manager("Manager", "A123456789", 50000,"123");
		((Manager)emps[3]).addEmployee(emps[2]);
		((Manager)emps[3]).addEmployee(emps[2]);
		((Manager)emps[3]).addEmployee(emps[1]);

		emps[4] = new Director("Director", "A123456789", 32345,"123",114514);

		for(int i =0; i<emps.length;i++) {
			System.out.printf("%s%n",emps[i]);
		}
	}
}
