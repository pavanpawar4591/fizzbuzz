package com.steerlean.fizzbuzz.rule;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestRuleFactory {

	@Test
	public void testDivisibilityRuleCreation() {
		RuleFactory factory = new RuleFactory();

		IRule irules = factory.createDivisibilityRule(10, "hello");
		IRule irules2 = factory.createDivisibilityRule(10, "hello");
		Assert.assertEquals(irules, irules2);

	}

	@Test
	public void testSumOfDigitalVisibility() {
		RuleFactory factory = new RuleFactory();

		IRule irules = factory.createSumOfDigitsDivisibility(2, "hello");

		IRule irules2 = factory.createSumOfDigitsDivisibility(2, "hello");

		// Assert.assertTrue(irules.equals(irules2));
		Assert.assertEquals(irules, irules2);

	}
}
