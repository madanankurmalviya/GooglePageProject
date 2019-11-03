package com.google.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.BaseTest;

public class LoginPage extends BaseTest
{
	
	                         //Page Factory OR
	
	@FindBy(name="q")
	WebElement search ;
	
	@FindBy(xpath="(.//input[@name='btnK'])[1]")
	WebElement btn;
	
	@FindBy(xpath=".//img[@alt='Google']")
	WebElement logo;
	
	@FindBy(xpath =".//a[@class = 'NKcBbd']")
	WebElement link;
	
	
	
	                        //Initialize the objects
	
	
	public LoginPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
						    //Actions
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateLogo()
	{
		return logo.isDisplayed();
	}
	
	public GoogleSecondPage SearchItem(String Prod1) throws IOException 
	{
		search.sendKeys(Prod1);
		btn.click();
		
		return new GoogleSecondPage();
	}
	
	
	
	
	
	
}
