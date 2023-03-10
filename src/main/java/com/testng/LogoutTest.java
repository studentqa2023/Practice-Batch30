package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.DriverManager;
import com.pagefactory.MasterPageFactory;

public class LogoutTest {

	WebDriver driver;
	WebDriverWait wait;
	MasterPageFactory mpf;

	@BeforeTest // Setup
	public void openBrowser() {
		// Open the browser
		DriverManager dm = new DriverManager();

		driver = dm.getDriver(driver);
	}

	@Test
	public void getLogout() {
		
		LoginTest obj = new LoginTest();
		//driver = obj.getLogin();
		
		mpf = new MasterPageFactory(driver);
		mpf.getDropdown().click();
		mpf.getLogoutbtn().click(); 

		// Go to Orange HRM URL
		//driver.navigate().to(BaseConfig.getConfigValue("URL"));

		// Maximize the screen
		//driver.manage().window().maximize();

		// Create an object of MasterPageFactory
		//MasterPageFactory mpf = new MasterPageFactory(driver);

		// Implicit Wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Wait till the loginbtn is loaded
		//wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// wait.until(ExpectedConditions.elementToBeClickable(mpf.getLoginbtn()));

		// Type the username in username field
		//mpf.getUsername().sendKeys(BaseConfig.getConfigValue("Username"));

		// Type the password in password field
		//mpf.getPassword().sendKeys(BaseConfig.getConfigValue("Password"));

		// Click on Login
		//mpf.getLoginbtn().click();

		// Wait until the dropdown is loaded/clickable

		//wait.until(ExpectedConditions.elementToBeClickable(mpf.getDropdown()));

		// Wait until the logoutbtn is clickable
		// wait.until(ExpectedConditions.elementToBeClickable(mpf.getLogoutbtn())

		// Click on dropdown
		//mpf.getDropdown().click();

		// Click on Logout
	//	mpf.getLogoutbtn().click();

		//
		if (mpf.getLoginbtn().isDisplayed()) {
			System.out.println("Logout successful!");
		} else {
			System.out.println("Logout failed!");
		}

	}
}
