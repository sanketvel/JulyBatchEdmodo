package com.icertis.webautomation.tests;

import org.junit.After;
import org.junit.Test;

import com.icertis.webautomation.pageObjects.HomePageToolBar;
import com.icertis.webautomation.pageObjects.LoginPage;
import com.icertis.webautomation.utils.BrowserManager;

import junit.framework.Assert;

public class LoginTest {

	
	
	
	
	@Test
	public void test_login()
	{
		LoginPage lpage = new LoginPage();
		lpage.login();
		
		// assert if homepage button is seen
		HomePageToolBar htb = new HomePageToolBar();
		Assert.assertTrue(htb.verify_login_successfull());
	}

	
	
	@After
	public void tear_down()
	{
		BrowserManager.tear_down();
	}
	
}
