package com.steerlean.fizzbuzz;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.steerlean.fizzbuzz.rule.IRule;
import com.steerlean.fizzbuzz.rule.RuleFactory;

import mockit.Expectations;
import mockit.Mocked;

public class TestRulesConfigurator {

	@Mocked
	private RuleFactory mockedRuleFactory;

	@Test
	public void testConfigure(@Mocked final IRule dummyDivisibilityRule1, @Mocked final IRule dummyDivisibilityRule2,
			@Mocked final IRule dummyDivisibilityRule3, @Mocked final IRule dummyDivisibilityRule4) throws Exception {
		// Arrenge
		new Expectations() {
			{
				mockedRuleFactory.createDivisibilityRule(3, "Fizz");
				returns(dummyDivisibilityRule1);

				mockedRuleFactory.createDivisibilityRule(5, "Buzz");
				returns(dummyDivisibilityRule2);

				mockedRuleFactory.createSumOfDigitsDivisibility(6, "FiJazz");
				returns(dummyDivisibilityRule3);

				mockedRuleFactory.createSumOfDigitsDivisibility(5, "BuJazz");
				returns(dummyDivisibilityRule4);

			}
		};
		// ACT
		RulesConfigurator rulesConfigurator = new RulesConfigurator(mockedRuleFactory);
		List<IRule> actualRuleList = rulesConfigurator.configure();

		Assert.assertEquals(4, actualRuleList.size());
		Assert.assertEquals(dummyDivisibilityRule1, actualRuleList.get(0));
		Assert.assertEquals(dummyDivisibilityRule2, actualRuleList.get(1));
		Assert.assertEquals(dummyDivisibilityRule3, actualRuleList.get(2));
		Assert.assertEquals(dummyDivisibilityRule4, actualRuleList.get(3));

	}
}
