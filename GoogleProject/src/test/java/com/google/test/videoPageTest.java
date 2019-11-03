package com.google.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.base.BaseTest;
import com.google.pages.GoogleSecondPage;
import com.google.pages.LoginPage;
import com.google.pages.videoPage;

public class videoPageTest extends BaseTest
{
	GoogleSecondPage secondPage;
	videoPage videopage;
	public videoPageTest() throws IOException
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		Before();
		login = new LoginPage();
		secondPage = login.SearchItem(prop.getProperty("Prod1"));
		videopage=secondPage.clickOnVideoLink();		
	}
	// hello
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	

}
