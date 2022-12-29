package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeInvocation {
	
	@Test()
	public void getMoney() {
		System.out.println("This is money!");
	}
	
	@Test
	public void getSalary(int a) {
		System.out.println("Salary");
		a=2;
		Assert.assertEquals(a=5, "Not true");
	}
	
	@Test
	public void getIncome() {
		System.out.println("Income");
	}

}
