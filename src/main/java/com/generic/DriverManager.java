package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {//To open the browser
	
	public WebDriver getDriver(WebDriver driver) {
		
		//Open the browser
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		return driver;
	}

}
