package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment10
{
    public static WebDriver oBrowser=null;
	public static void main(String[] args)
	{
		adminLoginCheck();
		usersLoginCheck();
		adminModifyCheck();
		adminDeleteUsersCheck();
		logout();
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
			
			 oBrowser.get("http://localhost:83/user/submit_tt.do");
			 Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyOutWindow()
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
	static void welcomeNote()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void adminLoginCheck()
	{
		try
		{
			launchBrowser();
			navigate();
			login("admin","manager");
			minimizeFlyOutWindow();
			createUser_1();
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
	static void login(String x, String y)
	{
		try
		{
			
			oBrowser.findElement(By.id("username")).sendKeys(x);
			oBrowser.findElement(By.name("pwd")).sendKeys(y);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click(); 	
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createUser_1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Demo1");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("u1");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("Demo1@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("adam");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Adam@1");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Adam@1");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(4000);
			logout();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
			
	static void createUser_2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Demo2");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("u2");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("Demo2@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("eva");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Eva@1");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Eva@1");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(4000);
			logout();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser_3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Demo3");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("u3");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("Demo3@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("noha");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Noha@1");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Noha@1");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(4000); 
			logout();
			Thread.sleep(4000);
	        
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
	static void modifyPwdCheck(String n)
	{
		try
		{
           
            oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys(n);
            oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(n);
            oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
            Thread.sleep(4000);  
        			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void logout()
	{
		try
		{
			
		  oBrowser.findElement(By.id("logoutLink")).click();
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
	
	static void usersLoginCheck()
	{
		try
		{
			login("adam","Adam@1");
			welcomeNote();
			Thread.sleep(4000);
			createUser_2();
			login("eva","Eva@1");
			welcomeNote();
			Thread.sleep(4000);
			createUser_3();
			login("noha","Noha@1");
			welcomeNote();
			Thread.sleep(4000);
			logout();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void adminModifyCheck()
	{
		try
		{
				 login("eva","Eva@1");
				 oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
				 oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[4]/td[1]/table")).click();
				 //oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[2]")).click();
				 modifyPwdCheck("Noha@12");
				 Thread.sleep(4000);
				 logout();
				 login("noha","Noha@12");
				 logout();
				 
				 login("adam","Adam@1");
				 oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
				 oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table")).click();
				// oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[4]/td[1]/table")).click();
				 modifyPwdCheck("Eva@12");
				 Thread.sleep(4000);
				 logout();
				 login("eva","Eva@12");
				 logout();
				 
				 login("admin","manager");
				 oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
				 oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[2]")).click();
				// oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table")).click();
				 modifyPwdCheck("Adam@12");
				 Thread.sleep(4000);
				 logout();
				 login("adam","Adam@12");
				 logout();
				
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUsers()
	{
		try
		{
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert msg=oBrowser.switchTo().alert();
			Thread.sleep(2000);
			msg.accept();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void adminDeleteUsersCheck()
	{
		try
		{
			login("eva","Eva@12");
			 Thread.sleep(4000);
			 oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			 oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[4]/td[1]/table")).click();
			 Thread.sleep(4000);
			 deleteUsers();
			 logout();
			 
			 
			 login("adam","Adam@12");
			 Thread.sleep(4000);
			 oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			 oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table")).click();
			 Thread.sleep(4000);
			 deleteUsers();
			 logout();
			 
			 login("admin","manager");
			 Thread.sleep(4000);
			 oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			 oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table")).click();
			 Thread.sleep(4000);
			 deleteUsers();
			 Thread.sleep(4000);
			 logout();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


