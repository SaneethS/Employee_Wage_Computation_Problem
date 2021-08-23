package com.employeewage;

public class EmployeeWageMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage computation problem");
		
		//UC1
		Employee emp = new Employee();
		if(emp.isPresent()) {
			System.out.println("Employee is present");
			emp.empHrs=8;
		}
		else {
			System.out.println("Employee is absent");
			emp.empHrs=0;
		}
		//UC2
		System.out.println("The Daily Wage of Employee : "+emp.dailyWage);
		

	}

}
