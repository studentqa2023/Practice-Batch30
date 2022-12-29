package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticeParameter {
	
	@Test
	@Parameters("myName")
	public void getName(String myName) {
		System.out.println(myName);
	}

}
