package com.abc.OrangeHrm.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {

	    WebDriver driver;
	   
	   // @FindBy(tagName="h1")List<WebElement> ele;
	 
	    public Dashboard(WebDriver driver)
	    {
	    	this.driver=driver;
	    	//PageFactory.initElements(driver,this);
	    }
	    public List<WebElement> getDashboardLabel()
	    {
			//return  ele;
	   
	    	return driver.findElements(By.tagName("h1"));
	    	
	    }
}
