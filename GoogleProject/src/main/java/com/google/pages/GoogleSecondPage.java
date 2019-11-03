package com.google.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.BaseTest;

public class GoogleSecondPage extends BaseTest 
{

	// Object Repository
	@FindBy(xpath=".//img[@alt='Google']")
	WebElement logo;
	
	@FindBy(xpath="(.//a[@class='q qs'])[1]")
	WebElement videoLink;
	
	@FindBy(xpath=".//a[text()='News']")
	WebElement newsLink;
	
	@FindBy(xpath="(.//a[@class='q qs'])[3]")
	WebElement imageLink;
	
	@FindBy(xpath="(.//a[@class='q qs'])[4]")
	WebElement mapLink;
	
	@FindBy(xpath=".//span[@class='hb2Smf']")
	WebElement voiceSearchLink;
	
	@FindBy(id="spchb")
	WebElement imageMic;
	
	@FindBy(id="resultStats")
	WebElement status;
	
	@FindBy(xpath=".//span[contains(text(),'Bengaluru')]")
	WebElement location;
	
	@FindBy(xpath=".//a[text()='Images']")
	static
	
	WebElement imagep;
			
	
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
	
	
	public imagePage googleImageLinkClick() throws IOException
	{
		imagep.click();
		return new imagePage();
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
	
	public boolean verifyLocation()
	{
		return 	location.isDisplayed();
	}
	
	public boolean micImage()
	{
		return imageMic.isDisplayed();
	}
	
	public void verifyVoiceLink()
	{
		voiceSearchLink.click();
	}
}
