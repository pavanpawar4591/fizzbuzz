package com.steerlean.fizzbuzz;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.steerlean.fizzbuzz.rule.DivisibilityRule;
import com.steerlean.fizzbuzz.rule.IRule;
import com.steerlean.fizzbuzz.rule.RuleFactory;
import com.steerlean.fizzbuzz.rule.SumOfDigitsDivisibility;

/**
 * 
 * @author Pavan.Pawar
 *
 */
public class TestRuleConfiguratorOne {

	@Test
	public void TestConfigure() {
		RuleFactoryStub s = new RuleFactoryStub();
		RulesConfigurator f = new RulesConfigurator(s);

		List<IRule> iruleList = f.configure();

		Assert.assertEquals(4, iruleList.size());

	}

}

class RuleFactoryStub extends RuleFactory {
	public IRule createDivisibilityRule(int divisor, String processedString) {
		return new DivisibilityRule(divisor, processedString);
	}

	public IRule createSumOfDigitsDivisibility(int divisor, String processedString) {
		return new SumOfDigitsDivisibility(divisor, processedString);
	}

}
