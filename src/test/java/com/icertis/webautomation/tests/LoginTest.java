package com.icertis.webautomation.tests;

import org.junit.After;
import org.junit.Test;

import com.icertis.webautomation.pageObjects.LoginPage;
import com.icertis.webautomation.utils.BrowserManager;

public class LoginTest {

	
	
	
	
	@Test
	public void test_login()
	{
		LoginPage lpage = new LoginPage();
		lpage.login();
	}
	
	
	@After
	public void tear_down()
	{
		BrowserManager.tear_down();
	}
	
}
