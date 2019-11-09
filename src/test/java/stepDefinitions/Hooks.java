package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import resources.Base;

public class Hooks extends Base {
	
	@Before("@Mobile")
	public void beforeValidation() {
		
		System.out.println("************* Hooks - Before Method ************");
		System.out.println("Mobile test validation - Before Hooks");
		
	}
	
	@After("@Mobile")
	public void afterValidation() {
		
		System.out.println("************* Hooks - After Method ************");
		System.out.println("Mobile test validation - After Hooks");
		
	}
	
	@After("@SeleniumTest1")
	public void afterSeleniumValidation1() {
		
		System.out.println("************* Closed All Browsers ************");
		driver.close();
	}

	@After("@SeleniumTest2")
	public void afterSeleniumValidation2() {
		
		System.out.println("************* Closed All Browsers ************");
		driver.close();
	}
}
