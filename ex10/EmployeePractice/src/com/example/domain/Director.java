package com.example.domain;

public class Director extends Manager{
	private double budget;
	public Director(String name, String ssn, double salary,String deptName,double budget) {
		super(name, ssn, salary,deptName);
		this.budget=budget;
	}
	
	public double getBudget() {
		return budget;
	}
	
	
	
	@Override
	public double getPay() {
		return getSalary()+employees.size()*10000;
	}
	@Override
	public String toString() {
		return  super.toString() +"\n"+
				"預算: "+ budget  ;
	}

}
