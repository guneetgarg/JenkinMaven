package com;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AppTest {

	@Test
	public void aaa() {
		System.out.println("************ A A *************");
	}

	@Test
	public void bbb() {
		System.out.println("************ B B *************");
	}

	@Test(groups = { "Sniff", "Regression" })
	public void validAuthenticationTest() {
		System.out.println(" Sniff + Regression" + System.getProperty("environment"));
	}

	@Test(groups = { "Regression" }, parameters = { "environment" })
	public void failedAuthenticationTest(String environment) {
		System.out.println("Regression-" + environment);
	}

	@Parameters("environment")
	@Test(groups = { "Sniff" })
	public void newUserAuthenticationTest(String environment) {
		System.out.println("Sniff-" + environment);
	}

	@Parameters("environment")
	@Test
	public void newTest(String environment) {
		System.out.println("------------------------" + environment);
	}

	
}
