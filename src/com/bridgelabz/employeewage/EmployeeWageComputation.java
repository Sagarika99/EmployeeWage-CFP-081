package com.bridgelabz.employeewage;

public class EmployeeWageComputation {
	public static final int is_full_time = 1;
	public static final int is_part_time = 2;
	
	public static int EmpWageCompute(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth) {
		int EmpHrs = 0, TotalWorkingDays = 0, TotalEmpHrs = 0;
		while (TotalEmpHrs <= maxHrsPerMonth && TotalWorkingDays < numOfWorkingDays) {
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
			//System.out.println("Day : " +TotalWorkingDays+ " EmpHrs: " +EmpHrs);
		}		
		int TotalEmpWage = TotalEmpHrs * empRatePerHr;
		System.out.println("Employee Total wage for "+company+" is " +TotalEmpWage);
		System.out.println();
		return TotalEmpWage;
	}
	
	public static void main(String[] args) {
		EmpWageCompute("Dmart", 10, 2, 20);
		EmpWageCompute("Reliance", 30, 6, 45);
	}
}
