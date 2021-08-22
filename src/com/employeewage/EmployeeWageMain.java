package com.employeewage;

public class EmployeeWageMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage computation problem");
		
		//UC1
		Employee emp = new Employee(1);//1:full-time employee 2:part-time employee
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
		
		//UC4
		System.out.println("Wage using Switch Statement : "+emp.calculateWage());
		
		//UC6
		int worked_hours_per_month = 0;
		int worked_days_per_month = 0;
		
		
		while(worked_hours_per_month < 100 && worked_days_per_month <20 ) {
			int hrs_wrk = (int)Math.floor(Math.random()*((8-4)+1)+4);
			System.out.println("Hours worked today = "+hrs_wrk);
			worked_hours_per_month += hrs_wrk;
			worked_days_per_month ++;
		}
		
		System.out.println("Total Worked Hours = "+worked_hours_per_month+"\nTotal Worked days = "+worked_days_per_month);
		System.out.println("Total Wage = "+emp.calculateWageHour(worked_hours_per_month));
		

	}

}