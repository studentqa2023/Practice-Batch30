package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//*[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//*[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	private WebElement loginbtn;
	
	@FindBy(xpath="//*[@class='oxd-userdropdown-name']")
	private WebElement dropdown;
	
	@FindBy(xpath="(//*[@class='oxd-userdropdown-link'])[4]")
	private WebElement logoutbtn;
	
	@FindBy(xpath="//*[@class='oxd-userdropdown-name']")
	private WebElement accountname;

	public WebElement getAccountname() {
		return accountname;
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getUsername() {
		return username;
	}

}
