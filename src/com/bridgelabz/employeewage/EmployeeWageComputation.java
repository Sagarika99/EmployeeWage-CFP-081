package com.bridgelabz.employeewage;

public class EmployeeWageComputation {	
	public final String company;
	public final int empRatePerHr;
	public final int numOfWorkingDays;
	public final int maxHrsPerMonth;
	public int totalEmpWage;
	
	public EmployeeWageComputation (String company, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth) {
		this.company = company;
		this.empRatePerHr = empRatePerHr;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHrsPerMonth = maxHrsPerMonth;
	}
	
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	
	@Override
	public String toString() {
		return "Employee Total wage for Company "+company+" is " +totalEmpWage;
	}
}	


