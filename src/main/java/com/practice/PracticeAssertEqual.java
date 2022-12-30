package com.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeAssertEqual {
	
	@Test
	public void getAssert() {
		
		System.out.println("Hello!");
		Assert.assertEquals(2, 4);
		System.out.println("Bye!");
		
	}

}
