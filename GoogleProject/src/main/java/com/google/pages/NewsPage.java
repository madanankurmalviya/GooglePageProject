package com.google.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.BaseTest;

public class NewsPage extends BaseTest
{

	@FindBy(className="dJZ8Tb")
	WebElement msgBottom;
	
	@FindBy(className = "Q8LRLc")
	WebElement btmName;
	
	
	public NewsPage() throws IOException 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String verifyBottomMessage()
	{
		return msgBottom.getText();
	}
	
	public String verifyBottomName()
	{
		return btmName.getText();
	}
	

}
