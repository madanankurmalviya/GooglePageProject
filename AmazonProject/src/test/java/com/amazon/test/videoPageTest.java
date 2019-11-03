package com.amazon.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.amazon.base.BaseTest;
import com.amazon.pages.GoogleSecondPage;
import com.amazon.pages.LoginPage;
import com.amazon.pages.videoPage;

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
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	

}
