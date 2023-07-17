package com.navneetAutomationLab.pagelayer;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//-------------Obj Repo----------------
	@FindBy(xpath="//a[text()='Checkout']")
	private WebElement checkOut_button_link;
	
	@FindBy(xpath="//a[text()='Continue Shopping']")
	private WebElement continueShopping_button_link;
	
	@FindBy(xpath="//i[@class='fa fa-times-circle']")
	private WebElement remove_button_link;
	
	
	
	//----------- ACtion methods ------------
	public void clickOnCheckOutLink()
	{
		checkOut_button_link.click();
	}

	public void clickOnContinueShoppingLink()
	{
		continueShopping_button_link.click();
	}
	
	public void removeTheProduct()
	{
		remove_button_link.click();
	}

	

}
