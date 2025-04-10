package com.example.domain;
import java.util.ArrayList;

public class Manager extends Employee{
	private String deptName;
	private ArrayList<Employee> employees =new ArrayList<>();
	
	public Manager(String name, String ssn, double salary,String deptName) {
		super(name, ssn, salary);
		this.deptName=deptName;
	}

	
	public String getDeptName() {
		return deptName;
	}

	public boolean addEmployee(Employee employee) {
		if(employees.contains(employee)) {
			System.out.printf("已經有了%n");
			return false;
		}else {
			employees.add(employee);
			return true;
		}
	}
	
	public boolean removeEmployee(Employee employee) {
		if(employees.contains(employee)) {
			employees.remove(employee);
			return true;
		}else {
			System.out.printf("查無此人%n");
			return false;
		}
	}
	public String getStaffDetails() {
		StringBuffer temp = new StringBuffer();
		if(employees.isEmpty()) {
		}else {
			temp.append("\n"+"管理:"+"\n");
			for(Employee e: employees) {
				temp.append("ID:"+e.getEmpld()+" Name:"+e.getName()+"\n");
			}

		}
		return temp.toString();
	}


	@Override
	public String toString() {
		return super.toString() + getStaffDetails() ;
	}




}
