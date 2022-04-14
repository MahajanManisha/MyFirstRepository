package com.abc.OrangeHrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
      WebDriver driver;
      public LoginPage(WebDriver driver)
      {
    	  this.driver=driver;
      }
      public WebElement  getUsernameTxt()
      {
    	  return driver.findElement(By.id("txtUsername"));
      }
      public WebElement   getpasswordTxt()
      {
    	  return driver.findElement(By.id("txtPassword"));
      }
      public WebElement   getsubmitTxt()
      {
		return driver.findElement(By.id("btnLogin"));
    	  
      }
      public WebElement getinvalidMessageLabel()
      {
		return driver.findElement(By.id("spanMessage"));
    	  
      }
      
      public void Login(String username, String password) {
    	  getUsernameTxt().sendKeys(username);  
    	  getUsernameTxt().getAttribute(username);
    	  
    	  getpasswordTxt().sendKeys(password);
    	  getsubmitTxt().click();
      }
}		

