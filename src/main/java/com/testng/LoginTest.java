package com.testng;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.generic.BaseConfig;
import com.generic.DriverManager;
import com.pagefactory.MasterPageFactory;

public class LoginTest {

	WebDriver driver;
	WebDriverWait wait;
	ExtentReports extent;
	ExtentTest test;

	@BeforeTest // Setup
	public void openBrowser() {
		// Open the browser
		
		ExtentSparkReporter reporter = new ExtentSparkReporter("target/LoginTestReport.html");
		reporter.config().setDocumentTitle("Testng Automation");
		reporter.config().setReportName("Smoke test");
		reporter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Company ", "SMART TECH");
		extent.setSystemInfo("Testing environment ", "QA");
		extent.setSystemInfo("Team ", "QA");
		extent.setSystemInfo("Tester Name: ", System.getProperty("user.name"));

		
		DriverManager dm = new DriverManager();

		driver = dm.getDriver(driver);
	}

	@SuppressWarnings("deprecation")
	@Test // Actual test
	public void getLogin() {

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
		// wait.until(ExpectedConditions.elementToBeClickable(mpf.getLogoutbtn()));

		// Print in the console if a test pass or fail

		if (mpf.getAccountname().isDisplayed()) {
			System.out.println("Login successful!");
		} else {
			System.out.println("Login failed!");
		}
		
		test = extent.createTest("Login test");

		/*
		 * Assert.assertTrue(mpf.getLoginbtn().isDisplayed(), "Login failed");
		 * Assert.assertTrue(false, null);
		 */

	}

	@AfterTest // tear down or close the browser
	public void tearDown() {
		driver.quit();
		extent.flush();
	}

}
