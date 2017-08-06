package com.icertis.webautomation.tests;

import com.icertis.webautomation.utils.BrowserManager;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Selectable 
{

	By selct_list = By.xpath(".//*[@id='selectable']/li");
	List<WebElement> item_list;
	@Test
	public void select_table()
	{
		
		BrowserManager.getDriver().get("http://demoqa.com/selectable/");
		item_list = BrowserManager.getDriver().findElements(selct_list);
		
		
		System.out.println(item_list.size());
		item_list.get(2).click();
		Assert.assertTrue(item_list.get(2).getAttribute("class").contains("ui-selected"));
		
		//verify();
		
	}
	@After
	public void tear_down()
	{
		BrowserManager.tear_down();
	}
	
}
