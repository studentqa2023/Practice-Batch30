package com.generic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pagefactory.MasterPageFactory;

public class OrangeBaseLogin {

	WebDriver driver;
	WebDriverWait wait;

	@SuppressWarnings("deprecation")
	public void getLogin() {

		// Open the browser
		DriverManager dm = new DriverManager();

		driver = dm.getDriver(driver);

		// Go to Orange HRM URL
		driver.navigate().to(BaseConfig.getConfigValue("URL"));

		// Maximize the screen
		driver.manage().window().maximize();

		// Create an object of MasterPageFactory
		MasterPageFactory mpf = new MasterPageFactory(driver);

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Wait till the loginbtn is loaded
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// wait.until(ExpectedConditions.elementToBeClickable(mpf.getLoginbtn()));

		// Type the username in username field
		mpf.getUsername().sendKeys(BaseConfig.getConfigValue("Username"));

		// Type the password in password field
		mpf.getPassword().sendKeys(BaseConfig.getConfigValue("Password"));

		// Click on Login
		mpf.getLoginbtn().click();

		// Wait until the dropdown is loaded/clickable

		wait.until(ExpectedConditions.elementToBeClickable(mpf.getDropdown()));

		// Wait until the logoutbtn is clickable
		//wait.until(ExpectedConditions.elementToBeClickable(mpf.getLogoutbtn()));
		
		
		// Print in the console if a test pass or fail
		
		 if(mpf.getAccountname().isDisplayed()) {
		 System.out.println("Login successful!"); } else {
		 System.out.println("Login failed!"); }
		 

		// Click on dropdown
		mpf.getDropdown().click();

	}

}
