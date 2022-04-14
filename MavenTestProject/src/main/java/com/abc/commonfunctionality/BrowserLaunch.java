package com.abc.commonfunctionality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


//We are developing framework--Skeleton
public class BrowserLaunch {
	
	public static WebDriver driver;
	public static Properties property;
	static ExtentReports report;
	public static ExtentTest test;
	public static String filepath;
	
	@BeforeSuite
	public void Browser_Initilisation()
	{
		ReadProperty();
		String Browsername = property.getProperty("Browsername");
		if(Browsername.equalsIgnoreCase("chrome"))
		{
		   System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		    driver =new ChromeDriver();
	       
		}else if(Browsername.equalsIgnoreCase("firefox"))
		{
	        System.setProperty("webdriver.gecko.driver", "url");
	       driver =new FirefoxDriver();
	      
		}else
		{
	       System.setProperty("webdriver.edge.driver","url");
	       driver =new EdgeDriver();
	       //obj2.get("");
		}
		driver.get(property.getProperty("url"));
	}
	
	
	@BeforeClass(alwaysRun=true)
	public static void startTest()
	{
		report=new ExtentReports("Result/Result.html",true);
	}
	@AfterSuite
	public void TestDown()
	{
		driver.quit();
	}
	
	
	
	
	
	public static void ReadProperty()
	{
		try {
			property=new Properties();
			property.load(new FileInputStream("src/test/resources/config.properties"));
		   
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
