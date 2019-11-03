package com.amazon.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.BaseTest;
import com.amazon.pages.GoogleSecondPage;
import com.amazon.pages.LoginPage;
import com.amazon.pages.imagePage;



public class imagePageTest extends BaseTest
{
	LoginPage login;
	GoogleSecondPage secondPage;
	imagePage imageThirdPage;
	
	public imagePageTest() throws IOException
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		Before();
		login = new LoginPage();
		secondPage = login.SearchItem(prop.getProperty("Prod1"));
		imageThirdPage=secondPage.googleImageLinkClick();
	}
	
	
	@Test
	public void verifyCameraImgaeTest()
	{
		Assert.assertTrue(imageThirdPage.verifyCameraImage());
	}
	
	@Test
	public void verifyCollectionTabVisibleTest()
	{
		Assert.assertEquals(imageThirdPage.verifyCollectionTab(), "SafeSearch","This is not valis and not matching-ankur malviya");
	}
		
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
