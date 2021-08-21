package com.employeewage;

public class EmployeeWageMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage computation problem");
		
		Employee emp = new Employee();
		if(emp.isPresent())
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
		

	}

}
