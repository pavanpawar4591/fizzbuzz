package com.steerlean.fizzbuzz;

import org.testng.annotations.Test;

import com.steerlean.fizzbuzz.rule.DivisibilityRule;

import junit.framework.Assert;

public class TestDivisibility {

	@Test
	public void testFizzParser(){
		
		DivisibilityRule rule = new  DivisibilityRule(3, "Fizz");
		
		
		Assert.assertEquals("Fizz", rule.parse(9));
		Assert.assertEquals("", rule.parse(20));
		Assert.assertEquals("Fizz", rule.parse(36));
	
	}
	
	
	@Test
	public void testBuzzParser(){
		DivisibilityRule rule = new  DivisibilityRule(5, "Buzz");
		
		Assert.assertEquals("Buzz", rule.parse(20));
	}
	
	
	
	
	@Test(expectedExceptions =ArithmeticException.class)	
	public void divisiblebyzero(){
		DivisibilityRule rule = new  DivisibilityRule(0, "undefined");
		
		rule.parse(0);
	}
}
