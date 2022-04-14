package com.abc.commonfunctionality;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
public class ScreenShotUtility extends Reporter {
	//public static String captureScreen()
	//{
	/* TakesScreenshot s=(TakesScreenshot)driver;
	   File scr=s.getScreenshotAs(OutputType.FILE);
	 //  String destinationpath=filepath +".png";
	   File file = new File("Screenshot.png"); 
	   //File tar=new File("");
	   
	   
	   try {
		   FileUtils.copyFile(scr,file);
	   }
	   catch(IOException e)
	   {
		   e.printStackTrace();
	   }
 
	return file+".png"; 
}



*/
public static String captureScreen()  {
	//Convert web driver object to TakeScreenshot
	String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
    TakesScreenshot scrShot =((TakesScreenshot)driver);
    //Call getScreenshotAs method to create image file
     File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
      String destinationpath=filepath+"/"+dateName+".png";
      System.out.println("filepath"+ filepath);
      System.out.println("destinationpath" + destinationpath);
      File DestFile=new File(destinationpath);
      try {
    	  FileUtils.copyFile(SrcFile, DestFile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      return dateName+".png";

}	 

  
}	
	
