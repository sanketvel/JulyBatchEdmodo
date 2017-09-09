package com.icertis.webautomation.stepDef;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.icertis.webautomation.utils.BrowserManager;

import cucumber.api.java.en.Given;

public class Selecttable {
	
	List<WebElement> item_list;
	By selct_list = By.xpath(".//*[@id='selectable']/li");

	@Given("^Open browser and Enter the URL$")
	public void enter_the_URL() throws Throwable {
		
	BrowserManager.getDriver().get("http://demoqa.com/selectable/");
	  
	}

	@Given("^Click on Select-table Option$")
	public void click_on_Select_table_Option() throws Throwable {
		item_list = BrowserManager.getDriver().findElements(selct_list);
		item_list.get(2).click();
		
		
	}

	@Given("^verified selected option$")
	public void verified_selected_option() throws Throwable {
		Assert.assertTrue(item_list.get(2).getAttribute("class").contains("ui-selected"));
	}



}
