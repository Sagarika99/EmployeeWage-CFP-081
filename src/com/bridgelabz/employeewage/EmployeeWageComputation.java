package com.bridgelabz.employeewage;

public class EmployeeWageComputation {
	public static final int is_full_time = 1;
	public static final int is_part_time = 2;
	
	private final String company;
	private final int empRatePerHr;
	private final int numOfWorkingDays;
	private final int maxHrsPerMonth;
	private int TotalEmpWage;
	
	public EmployeeWageComputation (String company, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth) {
		this.company = company;
		this.empRatePerHr = empRatePerHr;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHrsPerMonth = maxHrsPerMonth;
	}
	
	public void EmpWageCompute() {
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
			System.out.println("Day : " +TotalWorkingDays+ " EmpHrs: " +EmpHrs);
		}		
		TotalEmpWage = TotalEmpHrs * empRatePerHr;
	}
	
	@Override
	public String toString() {
		return "Employee Total wage for Company "+company+" is " +TotalEmpWage;
	}
	
	public static void main(String[] args) {
		EmployeeWageComputation dMart = new EmployeeWageComputation("Dmart", 10, 2, 20);
		EmployeeWageComputation reliance = new EmployeeWageComputation("Reliance", 30, 6, 45);
		dMart.EmpWageCompute();
		System.out.println(dMart);
		reliance.EmpWageCompute();
		System.out.println(reliance);
	}
}
