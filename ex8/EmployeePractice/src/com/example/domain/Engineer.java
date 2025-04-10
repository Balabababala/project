package com.example.domain;
import java.util.Arrays;

public class Engineer extends Employee{

	private String[] Skills=new String[5];
	private int skillCount;
	public Engineer(String name,String ssn,double salary) {
		super(name,ssn,salary);
	}
	
	
	
	public void addSkill(String skill){
		if(skillCount<5) {
			Skills[skillCount++]=skill;
		}else {
			System.out.printf("技能槽已滿%n");
		}
	}
	
	
	@Override
	public void displayInformation()  {
		super.displayInformation();
		if(skillCount==0) {
			System.out.printf("我都不會%n");
		}else {
			System.out.printf("我會的技能%n");
			for(int i=0 ;i<skillCount;i++) {
				System.out.printf("%s%n",Skills[i]);
			}
		}
	}
	
}
