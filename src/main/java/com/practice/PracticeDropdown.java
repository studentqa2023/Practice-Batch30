package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeDropdown {
	
	public void getProducts() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		WebElement products = driver.findElement(By.xpath("(//*[@id='first'])[2]"));
		
		Select sc = new Select(products);
		
		//sc.selectByVisibleText("Iphone");
		sc.selectByIndex(2);
		
	}
	
	public static void main(String[] args) {
		PracticeDropdown obj = new PracticeDropdown();
		obj.getProducts();
	}

}
