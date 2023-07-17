package com.navneetAutomationLab.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//--------------Obj repo ---------------------
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement email_address_txtbox;
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement password_txtbox;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement login_btn;
	
	
	//------------ Action methods ----------------

	public void enterEmailAddress()
	{
		email_address_txtbox.sendKeys("omkale123@gmail.com");
	}
	
	public void enterPassword()
	{
		password_txtbox.sendKeys("12345678");
	}
	
	public void clickOnLoginButton()
	{
		login_btn.click();
	}

}
