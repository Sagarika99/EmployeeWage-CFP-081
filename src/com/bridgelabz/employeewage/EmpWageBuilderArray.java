package com.bridgelabz.employeewage;

public class EmpWageBuilderArray {
	public static final int is_full_time = 1;
	public static final int is_part_time = 2;	
	
	private int noOfCompany = 0;
	public EmployeeWageComputation[] companyArray;
		
	public EmpWageBuilderArray() {
		companyArray = new EmployeeWageComputation[5];		
	}
	
	private void addCompany(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth) {
		companyArray[noOfCompany] = new EmployeeWageComputation (company, empRatePerHr, numOfWorkingDays, maxHrsPerMonth);
		noOfCompany++;
	}
	
	private void EmpWageCompute() {
		for(int i=0; i<noOfCompany; i++) {
			companyArray[i].setTotalEmpWage(EmpWageCompute(companyArray[i]));
			System.out.println(companyArray[i]);
		}
	}
		
	private int EmpWageCompute(EmployeeWageComputation employeeWageComputation) {
		int EmpHrs = 0, TotalWorkingDays = 0, TotalEmpHrs = 0;
		while (TotalEmpHrs <= employeeWageComputation.maxHrsPerMonth && TotalWorkingDays < employeeWageComputation.numOfWorkingDays) {
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
		return TotalEmpHrs * employeeWageComputation.empRatePerHr;
	}
	
	
	public static void main(String[] args) {
		EmpWageBuilderArray empwageBuilder = new EmpWageBuilderArray();
		
		empwageBuilder.addCompany("Dmart", 10, 2, 20);
		empwageBuilder.addCompany("Reliance", 30, 6, 45);
		
		empwageBuilder.EmpWageCompute();

	}
	

}
