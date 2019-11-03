package com.google.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.base.BaseTest;
import com.google.pages.LoginPage;

public class LoginTest extends BaseTest
{
	
	public LoginTest() throws IOException
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		Before();
		login = new LoginPage();
		
	}
	
	@Test
	public void logoTest()
	{
		login.validateLogo();	
	}
	
	@Test
	public void loginTitle() 
	{
		String title=login.validateLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	}
	
	@Test
	public void searchSubmit() throws IOException
	{
		login.SearchItem(prop.getProperty("Prod1"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}