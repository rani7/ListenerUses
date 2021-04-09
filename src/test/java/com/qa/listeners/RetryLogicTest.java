package com.qa.listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryLogicTest {
	
	//retry logic at class level-
	//@Test(retryAnalyzer=com.qa.analyzer.RetryAnalyzer.class) for each method
	// disadvantage - if there are 100 methods, same line has to be repeated
	@Test
	public void failTestMethod1() {
		Assert.assertEquals(true,false);
	}
	
	@Test
	public void failTestMethod2() {
		Assert.assertEquals(true,false);
	}

}
