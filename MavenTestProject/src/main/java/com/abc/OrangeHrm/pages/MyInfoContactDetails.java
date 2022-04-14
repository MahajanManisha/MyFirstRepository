package com.abc.OrangeHrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyInfoContactDetails {
     WebElement driver;
     public MyInfoContactDetails(WebElement driver)
     {
    	 this.driver=driver;
     }
     WebElement ContactDetailLink()
     {
		return driver.findElement(By.xpath("//a[text()='Contact Details']"));
    	 
     }
     WebElement ContactDetailsLabel()
     {
		return driver.findElement(By.xpath("//h1[text()='Contact Details']"));
    	 
     }
     WebElement EditbtnInfo()
     {
		return driver.findElement(By.id("btnSave"));
    	 
     }
     WebElement AddressStreet1()
     {
		return driver.findElement(By.xpath("//input[@id='contact_street1']"));
    	 
     }
     WebElement AddressStreet2()
     {
		return driver.findElement(By.xpath("//input[@id='contact_street2']"));
    	 
     }
     WebElement City()
     {
		return driver.findElement(By.xpath("//input[@id='contact_city']"));
    	 
     }
     WebElement State_Province()
     {
		return driver.findElement(By.xpath("//input[@id='contact_province']"));
    	 
     }
     WebElement Zip_Postal_Code()
     {
		return driver.findElement(By.xpath("//input[@id='contact_emp_zipcode']"));
    	 
     }
     WebElement Country()
     {
		return driver.findElement(By.xpath("//select[@id='contact_country']"));
    	 
     }
     WebElement Home_Telephone()
     {
		return driver.findElement(By.xpath("//input[@id='contact_emp_hm_telephone']"));
    	 
     }
     WebElement Mobile()
     {
		return driver.findElement(By.xpath("//input[@id='contact_emp_mobile']"));
    	 
     }
     WebElement Work_Telephone()
     {
		return driver.findElement(By.xpath("//input[@id='contact_emp_work_telephone']"));
    	 
     }
     WebElement Work_Email()
     {
		return driver.findElement(By.xpath("//input[@id='contact_emp_work_email']"));
    	 
     }
     WebElement OtherEmail()
     {
		return driver.findElement(By.xpath("//input[@id='contact_emp_oth_email']"));
    	 
     }
     WebElement SavebtnInfo()
     {
		return driver.findElement(By.id("btnSave"));
    	 
     }
    
}
