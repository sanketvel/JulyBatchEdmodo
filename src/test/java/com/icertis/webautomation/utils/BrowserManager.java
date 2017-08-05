package com.icertis.webautomation.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManager 
{
       private static WebDriver browser;

       private BrowserManager()
       {
    	   
       }
       
       public static WebDriver getDriver()
       {
    	   if(browser == null){
    	   
    	   String driver_path = System.getProperty("user.dir") + "\\src\\test\\java\\driver\\chromedriver.exe" ;
 	       System.out.println(driver_path);
 	       System.setProperty("webdriver.chrome.driver", driver_path);
 	       browser = new ChromeDriver();
 	       
 	       BrowserManager.settings();
 	       
    	   }
    	   return browser;
       }

	private static void settings() {
		if(browser != null)
		{
			browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			browser.manage().window().maximize();
			
			// delete cookies
			browser.manage().deleteAllCookies();
			
		}
		
	}

	public static void tear_down() {

          try
          {
        	  browser.quit();
          }
          catch(Exception e)
          {
        	  
          }
		
	}
}
