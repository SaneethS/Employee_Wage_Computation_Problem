package com.employeewage;

public class Employee {
	
	final static int IS_FULL_TIME=1;
	final static int IS_PART_TIME=2;
	final static int WAGE_PER_HOUR = 20;
	
	int empHrs=0;
	int empType;
	double empCheck=(int)Math.floor(Math.random()*10)%3;
	


	public boolean isPresent() {
		
		if(empCheck==IS_FULL_TIME) 
			return true;
		else
			return false;
		
	}

	
	
	int dailyWage = WAGE_PER_HOUR * empHrs;
	
	public boolean isPartTime() {
		
		if(empCheck==IS_PART_TIME) 
			return true;
		else
			return false;
		
	}

}
