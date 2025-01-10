package com.ShopperStack.GenericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest 
{
	static WebDriver sdriver;
    WebDriver driver;
    File_Utility fileUtility =new File_Utility();
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("@BeforeSuite");
	}

	@BeforeTest
	public void beforeTest()
	{
		System.out.println("@BeforeTest");
	}
	
	@BeforeClass
	public void beforeClass() throws IOException
	{
		System.out.println("@BeforeClass");
		String url= fileUtility.readPropertyFileData("url");
		String browser_name= fileUtility.readPropertyFileData("browserName");
		
		
		if(browser_name.contains("chrome")) 
		{
			driver= new ChromeDriver();
		}
		else if(browser_name.contains("firefox")) 
		{
			driver= new FirefoxDriver();
		}
		else if(browser_name.contains("edge")) 
		{
			driver= new EdgeDriver();
		}
		else
		{
		System.out.println("Please change.....");	
		}
		sdriver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(url);
		
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("@BeforeMethod");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("@AfterSuite");
	}

	@AfterTest
	public void afterTest()
	{
		System.out.println("@AfterTest");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("@AfterClass");
		driver.quit();
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("@AfterMethod");
	}
}
