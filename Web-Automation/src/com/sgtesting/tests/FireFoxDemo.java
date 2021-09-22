package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDemo
{
	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		 launchBrowser();
		 navigate();
		 login();
		 closeApplication();
	}
	static void launchBrowser()
	{
		try
		{
		   System.setProperty("webdriver.gecko.driver","C:\\driver\\geckodriver.exe");
	       oBrowser=new FirefoxDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		try
		{
		   oBrowser.get("http://localhost:83/user/submit_tt.do");
		   Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
		Thread.sleep(4000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
