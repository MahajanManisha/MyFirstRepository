package com.abc.OrangeHrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class ForgotPage {

	WebDriver driver;
    public ForgotPage(WebDriver driver)
    {
  	  this.driver=driver;
    }
   public WebElement getForgotLink()
   {
	return driver.findElement(By.linkText("Forgot your password?"));
	   
   }
   public WebElement forgotPage()
   {
	   return driver.findElement(By.tagName("h1"));
   }
   public WebElement forgotUsernm()
   {
	   return driver.findElement(By.id("securityAuthentication_userName"));
   }
   public WebElement resetPwdBtn()
   {
	   return driver.findElement(By.id("btnSearchValues"));
   }
   public WebElement cancelBtn()
   {
	   return driver.findElement(By.id("btnCancel"));
   }
   
   
 /*  public void forgot()
   {
	   getForgotLink().click();
	  
   }*/
   
   
   
   
}
