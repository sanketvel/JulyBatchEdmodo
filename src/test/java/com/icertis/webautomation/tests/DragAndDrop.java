package com.icertis.webautomation.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.icertis.webautomation.utils.BrowserManager;

public class DragAndDrop {
	
	//http://demoqa.com/droppable/
	
	@Test
	public void drag_and_drop()
	{
       BrowserManager.getDriver().get("http://demoqa.com/droppable/");
       WebElement dragable = BrowserManager.getDriver().findElement(By.id("draggableview"));
       WebElement dropable = BrowserManager.getDriver().findElement(By.id("droppableview"));
       
       // Actions
       Actions action = new Actions(BrowserManager.getDriver());
       action.dragAndDrop(dragable, dropable);
       action.perform();
       
	}

}
