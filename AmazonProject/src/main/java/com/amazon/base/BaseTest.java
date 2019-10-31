package com.amazon.base;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.amazon.pages.LoginPage;
import com.amazon.utilities.Utils;

public class BaseTest 
{
	public static WebDriver driver;
	public static Properties prop;
	public static LoginPage login;
	public BaseTest() throws IOException
	{
			prop = new Properties();
			FileInputStream fis = new FileInputStream("E:\\ANKUR MALVIYA\\eclipse\\New\\AmazonProject\\src\\main\\java\\com\\amazon\\config\\configProp");
			prop.load(fis);
				
	}
	
	public static void Before()
	{
		//String browserName = prop.getProperty("browser");
		System.setProperty("webdriver.chrome.driver", ".//Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Utils.page_time, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Utils.wait_time,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}
