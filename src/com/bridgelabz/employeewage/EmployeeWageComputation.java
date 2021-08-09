package com.bridgelabz.employeewage;

public class EmployeeWageComputation {
	public static final int is_full_time = 1;
	public static final int is_part_time = 2;

	public static void main(String[] args) {
		int EmpWagePerHr = 20;
		int EmpWorkingDays = 20;
		int EmpWage=0;
		int EmpHrs = 0;
		int EmpTotalWage = 0;
		
		for (int i=0 ; i<=EmpWorkingDays; i++) {
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
				case is_full_time :
					EmpHrs = 8;
					break;
				case is_part_time :
					EmpHrs = 4;
					break;
				default :
					EmpHrs = 0;
			}
			EmpWage = EmpHrs * EmpWagePerHr;
			EmpTotalWage += EmpWage;
			System.out.println("Emp wage :" +EmpWage);
		}		
		System.out.println("Employee Total wage is " +EmpTotalWage);
		

		

	}

}
