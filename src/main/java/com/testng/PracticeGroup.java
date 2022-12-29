package com.testng;

import org.testng.annotations.Test;

public class PracticeGroup {
	
	@Test(priority=0, groups= {"Smoke"})
	public void login() {
		System.out.println("This is login method");
	}
	
	@Test(priority=1, groups= {"Smoke"}, dependsOnMethods= {"login"})
	public void dress() {
		System.out.println("This is dress method");
	}
	
	@Test(priority=2, groups= {"Regression"}, dependsOnMethods= {"login"})
	public void shirts() {
		System.out.println("This is shirts method");
	}
	
	@Test(priority=3, groups= {"Smoke"}, dependsOnMethods= {"login"})
	public void cart() {
		System.out.println("This is cart method");
	}
	
	@Test(priority=4, groups= {"Smoke"}, dependsOnMethods= {"cart"})
	public void payment() {
		System.out.println("This is payment method");
	}

}
