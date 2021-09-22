package com.sgtesting.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
	public static WebDriver oBrowser=null;
	public static ActiPage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		deleteProject();
		deleteCustomer();
		logout();
		closeApplication();
	}

	static void launchBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiPage(oBrowser);
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
	{
		try {
			oBrowser.get("http://localhost:83/user/submit_tt.do");
			Thread.sleep(8000);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLoginButton().click();
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
			oPage.getFlyOutWin().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createCustomer()
	{
		try
		{
			oPage.getTasksIcon().click();
			Thread.sleep(2000);
			oPage.getaddCustomerOrProject().click();
			Thread.sleep(2000);
			oPage.getNewCustomerOption().click();
			Thread.sleep(2000);
			oPage.getCustomerNameField().sendKeys("customer1");
			Thread.sleep(2000);
			oPage.getCustomerDescriptionField().sendKeys("cust1desp");
			Thread.sleep(2000);
			oPage.getCreateCustomerCommitButton().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createProject()
	{
		try
		{
			oPage.getaddCustomerOrProject().click();
			Thread.sleep(2000);
			oPage.getNewProjectOption().click();
			Thread.sleep(2000);
			oPage.getProjectNameField().sendKeys("project1");
			Thread.sleep(2000);
			oPage.getProjectDescriptionField().sendKeys("cust1proj1");
			Thread.sleep(2000);
			oPage.getNewProjectCommitBtn().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteProject()
	{
		try
		{
			
			oPage.getProjectSettings().click();
			Thread.sleep(3000);
			oPage.getProjectActions().click();
			Thread.sleep(3000);
			oPage.getProjectDeleteOption().click();
			Thread.sleep(3000);
			oPage.getProjectDeleteConfirm().click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteCustomer()
	{
		try
		{
			oPage.getCustomerSettings().click();
			Thread.sleep(2000);
			oPage.getCustomerActionOption().click();
			Thread.sleep(2000);
			oPage.getCustomerDelete().click();
			Thread.sleep(2000);
			oPage.getCustomerDeleteConfirm().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
	static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(2000);
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

}

