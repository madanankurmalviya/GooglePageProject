package com.amazon.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.BaseTest;

public class GoogleSecondPage extends BaseTest 
{

	// Object Repository
	@FindBy(xpath=".//img[@alt='Google']")
	WebElement logo;
	
	@FindBy(xpath="(.//a[@class='q qs'])[1]")
	WebElement videoLink;
	
	@FindBy(xpath="(.//a[@class='q qs'])[2]")
	WebElement newsLink;
	
	@FindBy(xpath="(.//a[@class='q qs'])[3]")
	WebElement imageLink;
	
	@FindBy(xpath="(.//a[@class='q qs'])[4]")
	WebElement mapLink;
	
	@FindBy(xpath=".//span[@class='hb2Smf']")
	WebElement voiceSearchLink;
	
	@FindBy(id="resultStats")
	WebElement status;
			
	
	//Initialization of Objects
		public GoogleSecondPage() throws IOException {
			PageFactory.initElements(driver, this);
		}
		
		
	//Actions
	
	public String secondPageTitle()
	{
		return driver.getTitle();
		
	}
	
	public boolean googleSecondPageImage()
	{
		boolean img = imageLink.isDisplayed();
		return img;
	}
	
	public videoPage clickOnVideoLink() throws IOException
	{
		videoLink.click();
		return new videoPage();
	}
	
	public NewsPage clickOnNewsPage() throws IOException
	{
		newsLink.click();
		return new NewsPage();
	}
	
	public String getViewStatus()
	{
		return status.getText();
	}
	
	
}
