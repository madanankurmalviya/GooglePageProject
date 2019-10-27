package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.BaseTest;

public class LoginPage extends BaseTest
{
	//Page Factory 
	@FindBy(name = "username")
	static
	WebElement username;
	
	@FindBy(name = "username1")
	WebElement username1;
	
	@FindBy (xpath = ".//input[@id='twotabsearchtextbox']")
	static
	WebElement search;
	
	@FindBy (xpath = ".//span[@class='nav-sprite nav-logo-base']")
	static
	WebElement logo;
	
	@FindBy (xpath = ".//input[@type='submit'   and  @value ='Go']")
	static
	WebElement click;
	
	// initialize the page object
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public static String validatePageTitle()
	{
		return driver.getTitle();
	}
	
	public static boolean validateLogo()
	{
		return logo.isDisplayed();
	}
	
	public static void enterItem()
	{
		search.sendKeys("ear Phone");
		click.click();
	}
}
