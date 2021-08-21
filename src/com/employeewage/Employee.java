package com.employeewage;

public class Employee {

	public boolean isPresent() {
		double emp_attn=(int)Math.floor(Math.random()*10)%2;
		if(emp_attn==1) 
			return true;
		else
			return false;
		
	}

	final int wage_per_hour = 20;
	final int full_day_hour = 8;
	
	int daily_wage = wage_per_hour * full_day_hour;
	
	final int part_time_hour = 8;
	
	int part_time_wage = wage_per_hour * part_time_hour;
	
	final int work_day_per_month = 20;
	
	int wage_per_month = daily_wage * work_day_per_month;

}
