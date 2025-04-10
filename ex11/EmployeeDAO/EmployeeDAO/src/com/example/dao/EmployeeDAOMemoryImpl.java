package com.example.dao;


import java.util.ArrayList;
import java.util.List;

import com.example.model.Employee;

public class EmployeeDAOMemoryImpl implements EmployeeDAO{

	@Override
	public void add(Employee emp) {
		// TODO Auto-generated method stub
		employeeArray[emp.getId()] = emp;
	}

	@Override
	public void update(Employee emp) {
		// TODO Auto-generated method stub
		employeeArray[emp.getId()] = emp;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		 employeeArray[id] = null;
	}

	@Override
	public Employee findByID(int id) {
		// TODO Auto-generated method stub
		 return employeeArray[id];
	}

	@Override
	public Employee[] getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> emps = new ArrayList<>();
        // Iterate through the memory array and find Employee objects
        for (Employee e : employeeArray) {
            if (e != null) {
                emps.add(e);
            }
        }
        return emps.toArray(new Employee[0]);
	}
	
	
	
	

}
