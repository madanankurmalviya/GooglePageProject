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

public class NewsPageTest extends BaseTest
{
	GoogleSecondPage secondPage;
	LoginPage login;
	NewsPage newsPage;
	
	public NewsPageTest() throws IOException
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		Before();
		login = new LoginPage();
		secondPage = login.SearchItem(prop.getProperty("Prod1"));
		newsPage=secondPage.clickOnNewsPage();
	}
	
	@Test
	public void verifyBottomMessageTest()
	{
		System.out.println(newsPage.verifyBottomMessage());
		Assert.assertEquals(newsPage.verifyBottomMessage(),"ankur malviya","This is not matching - ankur - malviya");
	}
	
	@Test(dependsOnMethods="verifyBottomMessageTest")
	public void verifyBottomNameTest()
	{
		System.out.println(newsPage.verifyBottomName());
		Assert.assertEquals(newsPage.verifyBottomName(), "India" ,"Its not matched Bro");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
}
