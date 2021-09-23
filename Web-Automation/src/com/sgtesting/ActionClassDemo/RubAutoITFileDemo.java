package com.sgtesting.ActionClassDemo;
public class RubAutoITFileDemo {

	public static void main(String[] args) {
		
		try
		{
		
		//	Runtime.getRuntime().exec("E:\\ExampleAutomation\\AutoIT\\ExampleTest1.exe");
			Runtime obj=Runtime.getRuntime();
			obj.exec("E:\\ExampleAutomation\\AutoIT\\ExampleTest3.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
