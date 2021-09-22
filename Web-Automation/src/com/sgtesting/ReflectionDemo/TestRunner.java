package com.sgtesting.ReflectionDemo;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestRunner {
	public static String path=null;
	public static void main(String[] args) {
		path=System.getProperty("user.dir");
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			fin=new FileInputStream("C:\\ExcelDemo\\Data_Runner.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Sheet5");
			int rc=sh.getPhysicalNumberOfRows();
			for(int r=1;r<rc;r++)
			{
				row=sh.getRow(r);
				cell=row.getCell(0);
				String methodname=cell.getStringCellValue();
				cell=row.getCell(1);
				String pkgClassName=cell.getStringCellValue();
				
				System.out.println(methodname+ "  ---->  "+pkgClassName);
				
				Class cls=Class.forName(pkgClassName);  // returns object of class Class
				Object obj=cls.newInstance(); //return superclass obj (object)
				
				Method method=obj.getClass().getMethod(methodname,null); // by using obj we are accessing getClass() and getMethod()
				
				method.invoke(obj, null);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}



