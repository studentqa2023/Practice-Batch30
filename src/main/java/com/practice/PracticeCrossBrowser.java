package com.practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.generic.BaseConfig;
import com.pagefactory.MasterPageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeCrossBrowser {
	WebDriver driver;

	public void getBrowser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

			System.out.println("Browser opened=" + browser);
		} else if (browser.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

			System.out.println("Browser opened=" + browser);
		} else {
			System.out.println("Not found any browser");
		}

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		MasterPageFactory mpf = new MasterPageFactory(driver);

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Type the username in username field
		mpf.getUsername().sendKeys(BaseConfig.getConfigValue("Username"));

		// Type the password in password field
		mpf.getPassword().sendKeys(BaseConfig.getConfigValue("Password"));

		// Click on Login
		mpf.getLoginbtn().click();

	}

}
