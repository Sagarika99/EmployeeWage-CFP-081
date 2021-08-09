package com.bridgelabz.employeewage;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		int is_present = 1;
		
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == is_present)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");

	}

}
