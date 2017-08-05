package com.icertis.webautomation.pageObjects;

import com.icertis.webautomation.repository.Repo_Login;
import com.icertis.webautomation.utils.BrowserManager;

public class LoginPage 
{
	  String page_url = "https://www.edmodo.com/";
	  
      public LoginPage()
      {
    	  BrowserManager.getDriver().get(page_url);
      }

	  
      public void login()
      {
    	  // click on the login button
    	  BrowserManager.getDriver().findElement(Repo_Login.login_button).click();
    	  BrowserManager.getDriver().findElement(Repo_Login.unmame_tb).sendKeys("teachery1@gmail.com");
    	  BrowserManager.getDriver().findElement(Repo_Login.pwd_tb).sendKeys("123456");
    	  //login submit
    	  BrowserManager.getDriver().findElement(Repo_Login.login_submit).click();
      }
      
      
}
