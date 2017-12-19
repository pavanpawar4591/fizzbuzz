package com.steerlean.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import mockit.Mocked;
import mockit.Verifications;

public class TestApp {

	@Mocked
	private NumberProcessor mockedNumProcessor;

	@Test
	public void testStart(@Mocked final List<String> processedNumbers) {

		App appObj = new App(mockedNumProcessor);
		List<String> ActualString = appObj.start();

		Assert.assertNotNull(ActualString);

		new Verifications() {
			{
				mockedNumProcessor.processRange(1, 100, new ArrayList<String>());
				times = 1;
			}

		};

	}
}
