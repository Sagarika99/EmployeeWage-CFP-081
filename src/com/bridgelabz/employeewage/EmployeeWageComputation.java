package com.bridgelabz.employeewage;

public class EmployeeWageComputation {
	public static final int is_full_time = 1;
	public static final int is_part_time = 2;
	public static final int NumOfWorkingDays = 20;
	public static final int MaxWorkingHrs = 100;
	
	public static void Compute() {
		int EmpWagePerHr = 20;
		int EmpWage=0;
		int EmpHrs = 0;
		int TotalEmpHrs=0;
		int EmpTotalWage = 0;
		int TotalWorkingDays = 0;
		
		while (TotalEmpHrs <= MaxWorkingHrs && TotalWorkingDays < NumOfWorkingDays) {
			TotalWorkingDays ++;
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
			TotalEmpHrs += EmpHrs;
			System.out.println("Day : " +TotalWorkingDays+ " EmpHrs: " +EmpHrs);
		}		
		int TotalEmpWage = TotalEmpHrs * EmpWagePerHr;
		System.out.println("Employee Total wage is " +TotalEmpWage);
	}

}
