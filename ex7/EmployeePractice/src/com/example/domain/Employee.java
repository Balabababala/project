package com.example.domain;

public class Employee {
	public static int nextId=101;
	private int empId;
	private String name="default";
	private String ssn;
	private double salary=25890;
	
	public Employee(String name, String ssn,double salary) {
		this.empId = nextId++;
		setName(name);
		
		if (ssn.trim().length()!=0 && ssn!=null) {
			this.ssn=ssn;
		}else {
			System.out.printf("好好身分症%n");
		}

		if(salary>=28590) {
			this.salary=salary;
		}else {
			System.out.printf("好好打字%n");
		}
	}
	
	public int getEmpld() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public String getSsn() {
		return ssn;
	}
	public double getSalary() {
		return salary;
	}
	public void setName(String name) {
		if (name.trim().length()!=0 && name!=null) {
			this.name=name;
		}else {
			System.out.printf("好好打名字%n");
		}
	}
	public void raiseSalary(double increase) {
		if (increase>0) {
			salary+=increase;
		}else {
			System.out.printf("好好打字%n");
		}
		
	}
	public void displayInformation() {
		System.out.printf("========員工資料========%n");
		System.out.printf("編號: %d%n",empId);
		System.out.printf("姓名: %s%n",name);
		System.out.printf("SSN: %s%n",ssn);
		System.out.printf("薪水: %.2f%n",salary);
	}
}

