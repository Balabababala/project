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
	public String toString() {
		String skillStr = Arrays.stream(Skills)
                .filter(s -> s != null)
                .reduce((a, b) -> a + ", " + b)
                .orElse("無技能");
		
		return  super.toString() +"\n"+
				"技能: "+ skillStr  ;
	}
	
}
