package com.example;

import com.example.domain.*;

public class EmployeeTest {
	public static void main(String args[]) {

		Employee emp1 = new Employee("Sean", "A123456789", 50000);
		emp1.displayInformation();
		Admin emp2 = new Admin("Admin", "A123456789", 500000);
		emp2.displayInformation();
		Engineer emp3 = new Engineer ("Engineer", "A123456789", 5000000);
		emp3.addSkill("JAVA");
		emp3.addSkill("Android");
		emp3.addSkill("JAVA");
		emp3.addSkill("Android");
		emp3.addSkill("JAVA");
		emp3.addSkill("Android");
		emp3.displayInformation();
		Manager emp4 = new Manager("Manager", "A123456789", 50000,"123");
		emp4.displayInformation();
		Director emp5 = new Director("Director", "A123456789", 114514,"123",12345);
		emp5.displayInformation();
		
		
	}
}
