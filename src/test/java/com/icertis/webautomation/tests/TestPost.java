package com.icertis.webautomation.tests;

import org.junit.After;
import org.junit.Test;

import com.icertis.webautomation.pageObjects.HomePageToolBar;
import com.icertis.webautomation.pageObjects.LoginPage;
import com.icertis.webautomation.utils.BrowserManager;
import com.icertis.webautomation.utils.Helper;

public class TestPost {
  
	  
	
	   
	   @Test
	   public void test_note_posted()
	   {
            LoginPage lpage = new LoginPage();
            lpage.login();
            
            HomePageToolBar htb = new HomePageToolBar();
            
            //post the note
            String my_note = "Sample Text "+Helper.get_Random(200000); 
            htb.post_note(my_note);
	   }
	   


		@After
		public void tear_down()
		{
			BrowserManager.tear_down();
		}
}
