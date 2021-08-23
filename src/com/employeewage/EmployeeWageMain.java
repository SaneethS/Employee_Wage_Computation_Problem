package com.employeewage;

public class EmployeeWageMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage computation problem");
		
		
		Employee emp = new Employee();
		if(emp.isPresent()) {
			System.out.println("Employee is present");
			emp.empHrs=8;
		}else if(emp.isPartTime()) {
			System.out.println("Employee is present but part time");
			emp.empHrs=4;
		}
		else {
			System.out.println("Employee is absent");
			emp.empHrs=0;
		}
		
		System.out.println("The Daily Wage of Employee : "+emp.dailyWage);
		
	
		
		

	}

}
