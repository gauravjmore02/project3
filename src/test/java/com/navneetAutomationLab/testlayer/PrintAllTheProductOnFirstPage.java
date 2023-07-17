package com.navneetAutomationLab.testlayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.navneetAutomationLab.testBase.TestBase;

public class PrintAllTheProductOnFirstPage extends TestBase {
	
	@Test
	public void printAllTheProductFromFristPage()
	{
		List<WebElement> productElements=driver.findElements(By.tagName("a"));
		for(WebElement productElement : productElements)
		{
			System.out.println(productElement.getText());
		}
	}

}
