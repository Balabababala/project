package com.example.dao;

import com.example.model.Employee;

public interface EmployeeDAO {
    public Employee[] employeeArray = new Employee[10];
	
	public void add(Employee emp);
	public void update(Employee emp);
	public void delete(int id);
	public Employee findByID(int id);
	public Employee[] getAllEmployees();
}
