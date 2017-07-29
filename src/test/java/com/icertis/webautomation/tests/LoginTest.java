package com.icertis.webautomation.tests;

import com.icertis.webautomation.pageObjects.LoginPage;

public class LoginTest {

	
	
	public static void test_login()
	{
		LoginPage lpage = new LoginPage();
		lpage.login();
	}
	
	public static void main(String[] rags)
	{
	     LoginTest.test_login();
	}
	
}
