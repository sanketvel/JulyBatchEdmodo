package com.icertis.webautomation.utils;

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
    	   }
    	   return browser;
       }
}
