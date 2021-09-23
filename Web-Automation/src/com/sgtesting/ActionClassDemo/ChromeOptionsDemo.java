package com.sgtesting.ActionClassDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
	
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", ".\\Library\\drivers\\chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.addArguments("--start-maximized");
			oBrowser=new ChromeDriver(options);
			Thread.sleep(4000);
			oBrowser.get("https://www.icicibank.com/");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
