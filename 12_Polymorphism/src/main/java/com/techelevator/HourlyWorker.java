package com.techelevator;

public class HourlyWorker implements Worker{

	private String firstName;
	private String lastName;
	private double hourlyRate;
	//private int hoursWorked;
	
	public HourlyWorker(String firstName, String lastName, double hourlyRate) {
	
	this.firstName = firstName;
	this.lastName = lastName;
	this.hourlyRate = hourlyRate;
}


	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}


	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}
	
//	public int getHoursWorked() {
//		return hoursWorked;
//	}

	@Override
	public double calculateWeeklyPay(int hoursWorked) {
		//this.hoursWorked = hoursWorked;
		double pay;
		double overtime;
		
		
		if(hoursWorked >= 40) {
			pay = hoursWorked * hourlyRate;
			overtime = hoursWorked - 40;
			pay = pay + (hourlyRate * overtime * .5);
		
			return pay;
		}else {
			pay = hoursWorked * hourlyRate;
			return pay;
		}
	}
	
	
}
