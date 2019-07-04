package com.techelevator;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Payroll {

	public static void main(String[] args) {
		
		HourlyWorker bob = new HourlyWorker("Bob", "Smith", 9.0);
		HourlyWorker dan = new HourlyWorker("Dan", "Smith", 80.0);
		HourlyWorker tyler = new HourlyWorker("Tyler", "Smith", 14.0);
		VolunteerWorker ed = new VolunteerWorker("Ed", "Harley");
		VolunteerWorker ned = new VolunteerWorker("Ned", "Harley");
		SalaryWorker steve = new SalaryWorker("Steve", "Jacobs", 50000.00);
		SalaryWorker dave = new SalaryWorker("Dave", "Jacobs", 90000.00);
		
		
		//System.out.println(bob.calculateWeeklyPay((int)(Math.random()*100)));

		List<Worker> worker = new ArrayList<Worker>();	
		worker.add(bob);
		worker.add(dan);
		worker.add(tyler);
		worker.add(ed);
		worker.add(ned);
		worker.add(steve);
		worker.add(dave);
		
		int totalHours = 0;
		double totalPay = 0.0;
		
		for(Worker work : worker) {
			int hoursWorked = Math.abs((int)(Math.random()*100));
			double weeklyPay = work.calculateWeeklyPay(hoursWorked);
			System.out.println(work.getLastName() + ", " + work.getFirstName() + "   " + hoursWorked +  "   " + weeklyPay);
			totalHours += hoursWorked;
			totalPay += weeklyPay;
		}
		
		System.out.println("Total weekly hours are: " + totalHours);
		System.out.println("Total weekly pay is: " + totalPay);

	}

}
