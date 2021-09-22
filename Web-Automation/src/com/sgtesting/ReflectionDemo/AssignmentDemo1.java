package com.sgtesting.ReflectionDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AssignmentDemo1
{
    public static WebDriver oBrowser=null;
	/*public static void main(String[] args)
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		deleteUser();
		logout();
		closeApplication();
	}*/
	public void launchBrowser()
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
	public void navigate()
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
	public void login()
	{
		try
		{
			
			oBrowser.findElement(By.name("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click(); 	
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();		
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void closeApplication()
	{
		try
		{
			
			oBrowser.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void logout()
	{
		try
		{
			
		  oBrowser.findElement(By.id("logoutLink")).click();
		  System.out.println("****");
		  Thread.sleep(4000);
		
		}catch(Exception e)
		{
		   e.printStackTrace();	
		}
	}
	public void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("ABC");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("ABCuser");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("ABC@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("AbcUser1");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome11");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Welcome11");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(4000); 
	        
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(4000);
			Alert obj=oBrowser.switchTo().alert();
			String content=obj.getText();
			System.out.println(content);
			obj.accept();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


