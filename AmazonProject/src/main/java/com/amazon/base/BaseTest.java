package com.amazon.base;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest 
{
	public static WebDriver driver;
	
	@BeforeMethod
	public void Before()
	{
		System.setProperty("webdriver.chrome.driver",".//Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void After()
	{
		driver.close();
	}
}
