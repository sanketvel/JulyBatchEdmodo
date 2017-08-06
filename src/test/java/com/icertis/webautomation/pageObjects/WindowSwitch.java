package com.icertis.webautomation.pageObjects;

import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;

import com.icertis.webautomation.utils.BrowserManager;

public class WindowSwitch {
	
	
	By link_window = By.linkText("New Browser Tab");
	
	
	@Test
	public void window_switch()
	{
		BrowserManager.getDriver().get("http://demoqa.com/frames-and-windows/");
		System.out.println(BrowserManager.getDriver().getWindowHandle());
		
		//second window
		BrowserManager.getDriver().findElement(link_window).click();
		
		
		//list all the open windows
        Set<String> wins =  BrowserManager.getDriver().getWindowHandles();
		String s = "";
		for(String h : wins)
		{
			s = h;
		}
		BrowserManager.getDriver().switchTo().window(s);
		System.out.println("-------------------");
		System.out.println(BrowserManager.getDriver().getWindowHandle());
		
		BrowserManager.getDriver().switchTo().frame(1);
	}
	

	@After
	public void tear_down()
	{
		BrowserManager.tear_down();
	}

}
