package com.employeewage;

public class Employee {

	public boolean isPresent() {
		double empAttn=(int)Math.floor(Math.random()*10)%2;
		if(empAttn==1) 
			return true;
		else
			return false;
		
	}

	

}
