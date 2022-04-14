package com.abc.OrangeHrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyinfoPersonalPage {
   WebDriver driver;
   public  MyinfoPersonalPage(WebElement driver)
  {
	  this.driver=(WebDriver) driver;
  }
   WebElement  personalDetailsLink()
  {
	   return driver.findElement(By.xpath("//a[text()='Personal Details']"));
	  
  }
  WebElement PersonalDetailLabel()
  {
	
	  return driver.findElement(By.xpath("//h1[text()='Personal Details']"));
  }
  WebElement editMyInfoPersonal()
  
  {
	 return driver.findElement(By.xpath("//input[@id='btnSave']")) ;
  }
   WebElement FirstName()
   {
	   return driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']"));
   }
  
   WebElement MiddleName()
   {
	   return driver.findElement(By.xpath("//input[@id='personal_txtEmpMiddleName']"));
   }

   WebElement EmployeeId()
   {
	   return driver.findElement(By.xpath("//input[@id='personal_txtEmployeeId']"));
   }
   WebElement OtherId()
   {
	   return driver.findElement(By.xpath("//input[@id='personal_txtOtherID']"));
   }
   WebElement DriverLicenceNumber()
   {
	   return driver.findElement(By.xpath("//input[@id='personal_txtLicenNo']"));
   }
   WebElement LicenceExpiraryDate()
   {
	   return driver.findElement(By.xpath("//input[@id='personal_txtLicExpDate']"));
   }
   WebElement SSNNumber()
   {
	   return driver.findElement(By.xpath("//input[@id='personal_txtNICNo']"));
   }
   WebElement GenderMale()
   {
	   return driver.findElement(By.xpath("//label[@for='personal_optGender_1']"));
   }
   WebElement GenderFemale()
   {
	   return driver.findElement(By.xpath("//label[@for='personal_optGender_2']"));
   }
   WebElement MaritalStatus()
   {
	   return driver.findElement(By.xpath("//select[@name='personal[cmbMarital]']']"));
   }
   
   WebElement Nationality()
   {
	   return driver.findElement(By.xpath("//select[@name='personal[cmbNation]']"));
   }
   WebElement DateOfBirth()
   {
	   return driver.findElement(By.xpath("//input[@id='personal_DOB']"));
   }
   WebElement NickName()
   {
	   return driver.findElement(By.xpath("//input[@id='personal_txtEmpNickName']"));
   }
   WebElement Smoker()
   {
	   return driver.findElement(By.xpath("//input[@id='personal_chkSmokeFlag']"));
   }
   WebElement MilitaryService()
   {
	   return driver.findElement(By.xpath("//input[@id='personal_txtMilitarySer']"));
   }
   WebElement SavePersonal()
   {
	   return driver.findElement(By.xpath("//input[@id='btnSave']"));
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
  
   
   

}
