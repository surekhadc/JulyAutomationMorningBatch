package com.sgtesting.dataproviderdemo;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LoginLogoutDemo
{

	public static Logger log=Logger.getLogger("LoginLogoutDemo");
    public static WebDriver oBrowser=null;
	@Test(priority=1)
	public void launchBrowser()
	{
		try
		{
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\Nirvana\\Downloads\\chromedriver.exe");
			 oBrowser=new ChromeDriver();
			 Thread.sleep(4000);
			 log.info("launchbrowser");
			 oBrowser.manage().window().maximize();
			 Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	@Test(priority=2)
	public void navigate()
	{
		try
		{
			
			 oBrowser.get("http://localhost:83/user/submit_tt.do");
			 Thread.sleep(4000);
			 log.info("navigation method");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3,dataProvider="getLoginData")
	public void login(String a,String b)
	{
		try
		{
			
			oBrowser.findElement(By.name("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click(); 	
			Thread.sleep(4000);
			log.info("login method");
		//	oBrowser.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();		
		//	Thread.sleep(4000);
		//	oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		//	Thread.sleep(4000);
			oBrowser.findElement(By.id("logoutLink")).click();
			System.out.println("****");
			log.info("logout method");
		    Thread.sleep(4000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	public void closeApplication()
	{ 
		try
		{
			log.info("CloseApplication method");
			oBrowser.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@DataProvider
	public Object[][] getLoginData()
	{
	 return new Object[][] {{"admin","manager"},{"admin","manager"},{"admin","manager"}};
	}
	
}

 