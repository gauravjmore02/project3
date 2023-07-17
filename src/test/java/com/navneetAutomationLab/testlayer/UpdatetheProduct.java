package com.navneetAutomationLab.testlayer;

import org.testng.annotations.Test;

import com.navneetAutomationLab.pagelayer.CartPage;
import com.navneetAutomationLab.pagelayer.HomePage;
import com.navneetAutomationLab.pagelayer.ProductPage;
import com.navneetAutomationLab.testBase.TestBase;

public class UpdatetheProduct extends TestBase{

	@Test
	public void updateTheProductFunctionality()
	{
		HomePage home_obj = new HomePage(driver);
		ProductPage product_obj = new ProductPage(driver);
		//CartPage cart_obj=new CartPage(driver);
		
		home_obj.enterProductNameInSearchBox("iMac");
		product_obj.clickOnProduct();
		product_obj.clickOnAddToCart();
		driver.navigate().back();
		product_obj.clickOnProduct();
		product_obj.clickOnAddToCart();
		
		product_obj.clickOnShoppingCartLink(); 
		
	}
}
