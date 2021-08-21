package com.employeewage;

public class Employee {

	public boolean isPresent() {
		double emp_attn=(int)Math.floor(Math.random()*10)%2;
		if(emp_attn==1) 
			return true;
		else
			return false;
		
	}

	

}
