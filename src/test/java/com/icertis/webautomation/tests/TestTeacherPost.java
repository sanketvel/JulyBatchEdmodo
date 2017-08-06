package com.icertis.webautomation.tests;

import org.junit.After;
import org.junit.Test;

import com.icertis.webautomation.pageObjects.LoginPage;
import com.icertis.webautomation.pageObjects.TeacherPosts;
import com.icertis.webautomation.utils.BrowserManager;

public class TestTeacherPost {
	
	@Test
	public void test_assignment_post_teacher() throws InterruptedException
	{
		 LoginPage lpage = new LoginPage();
         lpage.login();
		
		 TeacherPosts tpost = new TeacherPosts();
	  	 tpost.post_assignment("6");
	}


	@After
	public void tear_down()
	{
		BrowserManager.tear_down();
	}
	
}
