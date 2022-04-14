package com.abc.commonfunctionality;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action extends BrowserLaunch{
	Actions act=new Actions(driver);
   public void rightclick(WebElement s)
   {
	   //Actions act=new Actions(driver);
	   act.contextClick(s).perform();
   }
   
   public void mousehover(WebElement a)
   {
	  // Actions act1=new Actions(driver);
	   act.clickAndHold(a).perform();
   }
   public void doubleclick(WebElement d)
   {
	  act.doubleClick(d).perform();
   }
   
}
