package com.google.utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class Utils 
{
	static WebDriver driver;
	public static long page_time = 20;
	public static long wait_time = 20;
	
	public static void managePopup()
	{
		Alert alert= driver.switchTo().alert();
		alert.accept();		
	}
}
