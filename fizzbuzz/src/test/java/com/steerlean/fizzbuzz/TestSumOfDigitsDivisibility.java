package com.steerlean.fizzbuzz;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.steerlean.fizzbuzz.rule.SumOfDigitsDivisibility;

public class TestSumOfDigitsDivisibility {

	@Test
	public void testParse() {
		SumOfDigitsDivisibility divi = new SumOfDigitsDivisibility(10, "hello");

		String result = divi.parse(20);
		Assert.assertEquals(result, "");

		String result2 = divi.parse(55);
		Assert.assertEquals(result2, "hello");

	}

	@Test
	public void testall() {
		SumOfDigitsDivisibility divi = new SumOfDigitsDivisibility(10, "hello");

		SumOfDigitsDivisibility div1 = new SumOfDigitsDivisibility(10, "hello");

		Assert.assertEquals(divi, div1);
		SumOfDigitsDivisibility div2 = new SumOfDigitsDivisibility(11, "hello");

		Assert.assertNotEquals(divi, div2);

	}

}
