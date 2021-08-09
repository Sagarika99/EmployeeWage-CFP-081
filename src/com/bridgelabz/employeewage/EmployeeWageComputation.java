package com.bridgelabz.employeewage;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		int is_present = 1;
		int EmpWagePerHr = 20;
		int EmpWage;
		int EmpHrs = 0;
		
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == is_present)
			EmpHrs = 8;
		else
			System.out.println("Employee is Absent");
		
		EmpWage = EmpHrs * EmpWagePerHr;
		System.out.println("Employee Daily wage is " +EmpWage);

	}

}
