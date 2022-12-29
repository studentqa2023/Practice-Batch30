package com.zoopla;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.generic.DriverManager;

public class ZooplaLogin {
	WebDriver driver;
	public void getZooplaLogin() {
		
		DriverManager dm = new DriverManager();
		
		driver = dm.getDriver(driver);
		
		driver.navigate().to("https://www.zoopla.co.uk/house-prices/");
		
		List<WebElement> acceptcookies = driver.findElements(By.xpath("//*[contains(text(),'Accept all cookies')]"));
		
		
		
		driver.findElement(By.xpath("(//*[contains(text(),'Sign in')])[3]")).click();
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sarowerny@gmail.com");
		
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("student2020");
		
		driver.findElement(By.xpath("(//*[contains(text(),'Sign in')])[3]")).click();
		
		if(driver.findElement(By.xpath("//*[contains(text(),'Sign out')]")).isDisplayed()) {
			System.out.println("Login successful!");
		}else {
			System.out.println("Login failed!");
		}
	}
	
	public static void main(String[] args) {
		ZooplaLogin obj = new ZooplaLogin();
		obj.getZooplaLogin();
	}

}
