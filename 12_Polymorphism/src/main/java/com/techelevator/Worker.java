package com.techelevator;

public interface Worker {
	
	String getFirstName();
	String getLastName();
	//int getHoursWorked();
	
	double calculateWeeklyPay(int hoursWorked);
	
}
