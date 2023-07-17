package com.navneetAutomationLab.testlayer;

import org.testng.annotations.Test;

import com.navneetAutomationLab.pagelayer.HomePage;
import com.navneetAutomationLab.pagelayer.Loginpage;
import com.navneetAutomationLab.testBase.TestBase;

public class LogOutAccount extends TestBase {
	
	@Test
	public void logOutAccount()
	{
		HomePage home_obj = new HomePage(driver);
		Loginpage login_obj = new Loginpage(driver);
		
		home_obj.clickOnMyAccountLink();
		home_obj.clickOnLoginLink();
		
		
		login_obj.enterEmailAddress();
		login_obj.enterPassword();
		login_obj.clickOnLoginButton();
		
		home_obj.clickOnMyAccountLink();
		home_obj.logOutTheAccount();
	}

}
