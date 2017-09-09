package com.icertis.webautomation.stepDef;

import com.icertis.webautomation.pageObjects.HomePageToolBar;
import com.icertis.webautomation.pageObjects.LoginPage;

import cucumber.api.java.en.Given;
import junit.framework.Assert;

public class LoginStep 
{

	LoginPage lpage;
	HomePageToolBar htb ;
	

	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		lpage = new LoginPage();
	}
	
	@Given("^verify if user successfully loged-in$")
	public void verify_if_user_successfully_loged_in() throws Throwable {
	    htb = new HomePageToolBar();
		Assert.assertTrue(htb.verify_login_successfull());
	}
    
	@Given("^user logins using username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_logins_using_username_and_password(String arg1, String arg2) throws Throwable {
		lpage.login(arg1,arg2);
	}
   
}
