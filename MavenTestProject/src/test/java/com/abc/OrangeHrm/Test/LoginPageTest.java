package com.abc.OrangeHrm.Test;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.abc.OrangeHrm.pages.Dashboard;

import com.abc.OrangeHrm.pages.LoginPage;
import com.abc.commonfunctionality.BrowserLaunch;
import com.abc.commonfunctionality.ReadExcel;
import com.abc.commonfunctionality.Reporter;
import com.abc.commonfunctionality.ScreenShotUtility;
import com.abc.commonfunctionality.commonWait;
import com.relevantcodes.extentreports.ExtentReports;

import com.relevantcodes.extentreports.LogStatus;

public class LoginPageTest extends Reporter{
  @Test(description="Verify the user is able to login with valid credential",priority=1)
	public void TC1()
	{
		Reporter.startTest("Verify the user is able to login with valid credential");
		LoginPage login=new LoginPage(driver);
		//commonWait com=new commonWait();
		login.Login(ReadExcel.getStringCellData("TC1", "UserName"),ReadExcel.getStringCellData("TC1", "Password"));
		//By p=By.id("menu_dashboard_index");
		//	commonWait.waitforelement(driver, p, 10);
	
		//Reporter.startTest("Verify the user is able to   login with valid credential");
		if(new Dashboard(driver).getDashboardLabel().size()>0)
		{
			Reporter.PassTest("User is able to login with valid credential");
		}
		else
		{
			Reporter.FailTest("User is not able to login with valid credential");
			//test.log(LogStatus.FAIL,"User is not  Sucessfully Login");
		}
	}
	
	@Test(description="Verify the user is not able to login with invalid credential",priority=0)
	public void TC2()
	{
		Reporter.startTest("Verify the user is not able to   login with valid credential");
		
		LoginPage login=new LoginPage(driver);
		
		login.Login(ReadExcel.getStringCellData("TC2", "UserName"),ReadExcel.getStringCellData("TC2", "Password"));
		if(login.getinvalidMessageLabel().isDisplayed())
		{
			//test.log(LogStatus.PASS,"User is not able to login in system "+login.getinvalidMessageLabel());
			//test.log(LogStatus.PASS, "Fail",test.addScreenCapture(ScreenShotUtility.captureScreen()));
			Reporter.PassTest("Pass");
			
		}	
		else
		{
		
			Reporter.FailTest("Fail");
			//test.log(LogStatus.FAIL, "Fail",test.addScreenCapture(ScreenShotUtility.captureScreen()));
	    }
	}

	/*@Test(priority=0)
	public void TC3()
	{
		test=report.startTest("Verify the forget link");
		ForgotPage fp=new ForgotPage(driver);
		//fp.forgot();
		
		fp.getForgotLink().click();
		 if(fp.forgotPage().isDisplayed())
			{
				test.log(LogStatus.PASS, "Forgot page is successfully open");
			}
			else
			{
				
			}
		
	}
	*/
	
	

}
