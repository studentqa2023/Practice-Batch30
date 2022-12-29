package com.testrun;

import com.practice.PracticeCrossBrowser;

public class CrossBrowserTestUsingJava {
	
	public static void main(String[] args) {
		
		PracticeCrossBrowser obj = new PracticeCrossBrowser();
		
		obj.getBrowser("Chrome");
		
		obj.getBrowser("Firefox");
		
		//obj.getBrowser("Microsoft Edge");
	}

}
