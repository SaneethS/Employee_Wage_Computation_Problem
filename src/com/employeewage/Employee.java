package com.employeewage;

public class Employee {
	
	final static int IS_FULL_TIME=1;
	final static int WAGE_PER_HOUR = 20;
	
	int empHrs=0;

	public boolean isPresent() {
		double emp_attn=(int)Math.floor(Math.random()*10)%2;
		if(emp_attn==IS_FULL_TIME) 
			return true;
		else
			return false;
		
	}

	
	
	int dailyWage = WAGE_PER_HOUR * empHrs;

}
