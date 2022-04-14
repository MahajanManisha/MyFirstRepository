package com.abc.OrangeHrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyInfoCustomFields {
	WebDriver driver;
	public MyInfoCustomFields(WebDriver driver)
	{
		this.driver=driver;
	}
	WebElement EditCustom()
	{
		return  driver.findElement(By.xpath("//input[@id='btnEditCustom']"));
	}
	WebElement BloodType()
	{
		return  driver.findElement(By.xpath("//select[@name='custom1']"));
				
						
				
	}

}
