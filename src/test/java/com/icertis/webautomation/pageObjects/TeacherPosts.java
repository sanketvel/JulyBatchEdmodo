package com.icertis.webautomation.pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.icertis.webautomation.utils.BrowserManager;

public class TeacherPosts {

	
	By assignment_tab = By.id("assignment_link");
    By select_hour = By.className("scheduled-time-hour");
	
	public void post_assignment(String hr) throws InterruptedException
	{
        BrowserManager.getDriver().findElement(assignment_tab).click();
        //select hour
        Select hour = new Select(BrowserManager.getDriver().findElement(select_hour));
        hour.selectByVisibleText(hr);
        
        System.out.println(BrowserManager.getDriver().findElement(assignment_tab).getAttribute("class"));
        System.out.println(BrowserManager.getDriver().findElement(assignment_tab).getLocation());
        
        
        Thread.sleep(8000);
       
	}
	
}
