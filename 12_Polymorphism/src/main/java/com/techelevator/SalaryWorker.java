package com.techelevator;

public class SalaryWorker implements Worker{
	
	private String firstName;
	private String lastName;
	private double annualSalary;
	//private int hoursWorked;
	
	public SalaryWorker(String firstName, String lastName, double annualSalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.annualSalary = annualSalary;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}
	
	@Override
	public String getFirstName() {
		return firstName;
	}
	
	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public double calculateWeeklyPay(int hoursWorked) {
		double pay;
		//this.hoursWorked = hoursWorked;
		pay = annualSalary / 52d;
		return pay;
	}

//	public int getHoursWorked() {
//		return hoursWorked;
//	}
	
	
}
