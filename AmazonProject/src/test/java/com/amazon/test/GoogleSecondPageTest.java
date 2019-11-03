package com.amazon.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.BaseTest;
import com.amazon.pages.GoogleSecondPage;
import com.amazon.pages.LoginPage;
import com.amazon.pages.NewsPage;
import com.amazon.pages.videoPage;
import com.amazon.utilities.Utils;

public class GoogleSecondPageTest extends BaseTest 
{
	LoginPage login;
	GoogleSecondPage secondPage;
	videoPage video;
	NewsPage news;
	public GoogleSecondPageTest() throws IOException 
	{ 
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		Before();
		login = new LoginPage();
		video= new videoPage();
		news = new NewsPage();
		secondPage = login.SearchItem(prop.getProperty("Prod1"));
			
	}
	
	@Test (enabled = false)
	public void verifyTitleSecondPageTest()
	{
		String title=secondPage.secondPageTitle();
		System.out.println("The title is : "+title);
		Assert.assertEquals(title, "Ankur Malviya - Google Search", "Title not matched - ankur malviya ");
	}
	//
	@Test 
	public void verifyLogoDisplayedTest() 
	{
		boolean flag = secondPage.googleSecondPageImage();
		Assert.assertTrue(flag);
	}
	
	@Test 
	public void verifyVideoLinkVerifyTest() throws IOException
	{
		video= secondPage.clickOnVideoLink();
	}
	
	@Test
	public void verifyNewsPageLink() throws IOException
	{
		news = secondPage.clickOnNewsPage();
	}
	
	@Test
	public void verifySecondPageStatusTest()
	{
		String status = secondPage.getViewStatus();
		System.out.println(status);
		Assert.assertNotNull(status);
	}
	
	@Test
	public void verifyLocationTest()
	{
		Assert.assertTrue(secondPage.verifyLocation());
	}
	
	
	@Test
	public void verifyMicLinkTest()
	{
		secondPage.verifyVoiceLink();
		Utils.managePopup();
		Assert.assertTrue(secondPage.micImage());
	}
	
	@AfterMethod
	public void tearDown()
		{
			driver.quit();
		}
}
