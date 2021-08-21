package com.employeewage;

public class EmployeeWageMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage computation problem");
		
		//UC1
		Employee emp = new Employee();
		if(emp.isPresent())
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
		
		//UC2
		System.out.println("The Daily Wage of Employee : "+emp.daily_wage);
		
		//UC3
		System.out.println("The Part time wage of Employee : "+emp.part_time_wage);
		
		//UC5
		System.out.println("Wage of the employee per month : "+emp.wage_per_month);
		

	}

}
