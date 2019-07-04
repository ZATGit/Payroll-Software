package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SalaryWorkerTest {

	
	private SalaryWorker salaryworker;
	
	@Before
	public void setup() {
		salaryworker = new SalaryWorker("John", "Smith", 52000.00);
		
	}
	
	@Test
	public void hoursworked_is_0() {
		double salary = salaryworker.calculateWeeklyPay(0);
		Assert.assertEquals(1000,salary,2);
	}
	
	@Test
	public void hoursworked_is_null() {
		double salary = salaryworker.calculateWeeklyPay(null);
		Assert.assertEquals(0,salary,2);
	}
	
	@Test
	public void hoursworked_is_100() {
		double salary = salaryworker.calculateWeeklyPay(100);
		Assert.assertEquals(1000,salary,2);
	}
	
	@Test
	public void hoursworked_is_a_negative() {
		double salary = salaryworker.calculateWeeklyPay(-1);
		Assert.assertEquals(1000,salary,2);
	}
	
	

}
