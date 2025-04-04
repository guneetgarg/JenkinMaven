package com;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AppTest {

	/**
	 * Executes a simple test by printing a predefined message to the console.
	 */
	@Test
	public void aaa() {
		System.out.println("************ A A *************");
	}

	@Test
	public void bbb() {
		System.out.println("************ B B *************");
	}

	/**
	 * Executes a valid authentication test by printing a message that includes the current "environment" system property.
	 *
	 * <p>This test, which belongs to both the "Sniff" and "Regression" groups, outputs a static prefix
	 * ("Sniff + Regression") followed by the value retrieved via {@code System.getProperty("environment")}.
	 * It serves to validate that the test environment is correctly configured.</p>
	 */
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

	/**
	 * Prints the provided environment identifier to the console.
	 *
	 * <p>This test method verifies that the environment parameter is correctly injected via TestNG
	 * and outputs it for confirmation or debugging purposes.</p>
	 *
	 * @param environment the environment identifier passed from the TestNG configuration
	 */
	@Parameters("environment")
	@Test
	public void newTest(String environment) {
		System.out.println("------------------------" + environment);
	}

	
}
