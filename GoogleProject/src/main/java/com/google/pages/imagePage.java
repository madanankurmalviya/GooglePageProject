package com.google.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.BaseTest;

public class imagePage extends BaseTest
{

	@FindBy(className="S3Wjs")
	
	WebElement camera;
	
	
	@FindBy(xpath=".//a[text()='SafeSearch']")
	WebElement collections;
		
	public imagePage() throws IOException
	{
		PageFactory.initElements(driver, this);
	
	}
	
	//Action Methods
	
	public boolean verifyCameraImage()
	{
		return camera.isDisplayed();
	}
	
	public String verifyCollectionTab()
	{
		System.out.println(collections.getText());
		return collections.getText();
	}

}
