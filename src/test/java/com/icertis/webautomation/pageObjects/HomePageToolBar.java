package com.icertis.webautomation.pageObjects;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.icertis.webautomation.utils.BrowserManager;


public class HomePageToolBar {

	WebElement home_page_button;
    By note_tab_link = By.linkText("Note");
	By note_tb = By.cssSelector(".postbox-note.expandable.placeholder-input");
	
	By group_suggestion_tb = By.id("s2id_autogen2");
	By group_sg = By.xpath(".//ul[@class='select2-results']/li");
	By note_post = By.xpath(".//*[@id='postbox-note-content']/div/section/section/div[2]/div[2]/button");
	By stream_list = By.className("stream-item");
	
	
	public boolean verify_login_successfull()
	{
		return BrowserManager.getDriver().findElement(By.linkText("Home")).isDisplayed();
	}

	public void post_note(String my_note) throws Exception {
		
		BrowserManager.getDriver().findElement(note_tab_link).click();
		List<WebElement> tb_list =   BrowserManager.getDriver().findElements(note_tb);
		tb_list.get(1).sendKeys(my_note);
		
		//SELECT TARGET GROUP
		BrowserManager.getDriver().findElements(group_suggestion_tb).get(0).sendKeys("Sam ");

		Thread.sleep(5000);
		
		List<WebElement> groups_suggestion  = BrowserManager.getDriver().findElements(group_sg);
		
		for(WebElement e : groups_suggestion)
		{
			if(e.getText().equals("Sam Atkins"))
			{
				e.click();
				System.out.println("Found Sam ATtkins..");
				break;
			}
			else
			{
				System.out.println("Not Found yet");	
			}
		}
		
        //sleep

		BrowserManager.getDriver().findElement(note_post).click();
        Thread.sleep(5000);
		
	}
	
	
	public boolean verify_if_note_posted(String my_note)
	{
		
		List<WebElement> Post_List  = BrowserManager.getDriver().findElements(stream_list);
		
		System.out.println(BrowserManager.getDriver().findElements(By.className("stream-container")).size());
		
//		for (WebElement e : Post_List )
//		{
//			if(e.getText().contains(my_note))
//			{
//				return true;
//			}
//		}
		
		if(BrowserManager.getDriver().findElement(By.className("stream-container")).getText().contains(my_note) )
		{
			return true;
		}
		
		return false;
		
	}
	
	
	

	
}
