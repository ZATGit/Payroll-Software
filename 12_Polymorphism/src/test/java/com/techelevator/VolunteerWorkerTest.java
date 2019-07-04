package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VolunteerWorkerTest {
	
	private VolunteerWorker volunteerworker;
	
	@Before
	public void setup() {
		volunteerworker = new VolunteerWorker("John", "Smith");
		
	}
	
	@Test
	public void hoursworked_is_0() {
		double salary = volunteerworker.calculateWeeklyPay(0);
		Assert.assertEquals(0,salary,2);
	}
	
	@Test
	public void hoursworked_is_null() {
		double salary = volunteerworker.calculateWeeklyPay(null);
		Assert.assertEquals(0,salary,2);
	}
	
	@Test
	public void hoursworked_is_100() {
		double salary = volunteerworker.calculateWeeklyPay(100);
		Assert.assertEquals(0,salary,2);
	}
	
	@Test
	public void hoursworked_is_a_negative() {
		double salary = volunteerworker.calculateWeeklyPay(-1);
		Assert.assertEquals(0,salary,2);
	}
	
}
