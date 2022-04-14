package com.abc.commonfunctionality;

import java.io.File;
import java.util.Date;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;



public class Reporter extends BrowserLaunch {


	@BeforeTest(alwaysRun=true)
public static void Report()
	{
		Date now = new Date(); //this will give current time in date and time format
		String Timestamp = now.toString().replace(":", "-"); //it is replaceing : with -
		File file = new File("Result/"+Timestamp); //This will be folder path
		file.mkdir(); //It will create new folder
		filepath=file.getPath();
		 report = new ExtentReports(file.getPath()+"/Result.html", true);
	
	}

	public static void startTest(String Testcase) {
		
		test = report.startTest("Testcase");
	}
	//extentreport
	//passtest
	public static void PassTest(String teststep) {
		test.log(LogStatus.PASS, teststep);
	}
	
	public static void FailTest(String teststep) {
		test.log(LogStatus.FAIL, teststep,test.addScreenCapture(ScreenShotUtility.captureScreen()));
	}
	
	
	
	
	public static void startTest()
	{
		report=new ExtentReports("Result/Result.html",true);
	}
	
	@AfterTest(alwaysRun=true)
	public static void endTest()
	{
		System.out.println(" after test");
		report.endTest(test);
		report.flush();
	}
}