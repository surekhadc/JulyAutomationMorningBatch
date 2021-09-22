package com.sgtesting.tests;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoExample
{
    public static WebDriver oBrowser=null;
	public static void main(String[] args)
	{
		launchBrowser();
		navigate();
		login();
		responseMsg();
		closeApplication();
	}
	static void launchBrowser()
	{
		try
		{
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\Nirvana\\Downloads\\chromedriver.exe");
			 oBrowser=new ChromeDriver();
			 Thread.sleep(4000);
			 oBrowser.manage().window().maximize();
			 Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	static void navigate()
	{
		try
		{
			
			 oBrowser.get("http://test.boxigo.in/contact-us");
			 Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			
			oBrowser.findElement(By.id("name")).sendKeys("UserDemo");
			oBrowser.findElement(By.id("email")).sendKeys("User1@123");
			oBrowser.findElement(By.name("phone")).sendKeys("1234560789");
			oBrowser.findElement(By.xpath("//textarea[@id='message']")).sendKeys("This is a sample message!!");
			oBrowser.findElement(By.xpath("//input[@type='submit']")).submit(); 	
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
	static void responseMsg()
	{
		try
		{
			
			HttpURLConnection cont=(HttpURLConnection) new URL("http://test.boxigo.in/home/thank_you_for_contacting_us").openConnection();
					cont.setRequestMethod("HEAD");
					cont.connect();
					int res = cont.getResponseCode();
					System.out.println("Successfull!!!...."+res);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
}


