package com.icertis.webautomation.stepDef;

import com.icertis.webautomation.utils.BrowserManager;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public static void setup()
	{
	    System.out.println("inside the setup...");
	}
	
	
	@After
	public static void teardown()
	{
	    BrowserManager.tear_down();
	}

}
