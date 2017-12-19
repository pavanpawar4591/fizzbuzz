package com.steerlean.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import mockit.Expectations;
import mockit.Mocked;

public class TestNumberProcessor {

	@Mocked
	private RuleEngine mockedRuleEngine;

	@Test
	public void testProcessRange() {

		new Expectations() {
			{
				mockedRuleEngine.run(1);
				returns(new String("s1"));

				mockedRuleEngine.run(2);
				returns(new String("s2"));

				mockedRuleEngine.run(3);
				returns(new String("s3"));

			}
		};

		NumberProcessor numProcessor = new NumberProcessor(mockedRuleEngine);

		List<String> processedNumberList = new ArrayList<String>();

		numProcessor.processRange(1, 3, processedNumberList);

		Assert.assertEquals(3, processedNumberList.size());
		Assert.assertEquals("s1", processedNumberList.get(0));
		

	}
}
