package com.navneetAutomationLab.testlayer;

import org.testng.annotations.Test;



import com.navneetAutomationLab.pagelayer.HomePage;
import com.navneetAutomationLab.pagelayer.ProductPage;
import com.navneetAutomationLab.testBase.TestBase;

public class BuyProductFunctionality extends TestBase {
	
	@Test
	public void verifyAddProductFunctionality()
	{
		HomePage home_obj = new HomePage(driver);
		ProductPage product_obj = new ProductPage(driver);
		
		
		home_obj.enterProductNameInSearchBox("iMac");
		product_obj.clickOnProduct();
		product_obj.clickOnAddToCart();
		product_obj.clickOnShoppingCartLink();
	  
	}

}
