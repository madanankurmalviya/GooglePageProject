package com.amazon.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazon.base.BaseTest;
import com.amazon.pages.LoginPage;

public class LoginTest extends BaseTest
{
	
	@Test
	public void LoginPageTitle()
	{
		String title = LoginPage.validatePageTitle();
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	@Test
	public void LoginLogo()
	{
		boolean logo = LoginPage.validateLogo();
		Assert.assertTrue(logo);
	}
	
	@Test
	public void LoginSearch()
	{
		LoginPage.enterItem();
	}
}
