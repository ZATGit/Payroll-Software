package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HourlyWorkerTest {

	private HourlyWorker hourlyworker;
	
	@Before
	public void setup() {
		hourlyworker = new HourlyWorker("John", "Smith", 20.0);
		
	}
	
	@Test
	public void hoursworked_is_0() {
		double salary = hourlyworker.calculateWeeklyPay(0);
		Assert.assertEquals(0,salary,2);
	}
	
	@Test
	public void hoursworked_is_null() {
		double salary = hourlyworker.calculateWeeklyPay(null);
		Assert.assertEquals(0,salary,2);
	}
	
	@Test
	public void hoursworked_is_100() {
		double salary = hourlyworker.calculateWeeklyPay(100);
		Assert.assertEquals(2600,salary,2);
	}
	
	@Test
	public void hoursworked_is_a_negative() {
		double salary = hourlyworker.calculateWeeklyPay(-1);
		Assert.assertEquals(-20,salary,2);
	}
	
	
	
}
