package javaPrograms;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.w3c.dom.DOMConfiguration;

public class ReadExcelMain {
	

	public static void main(String[] args) throws IOException {
		
		String TestcaseName="ReadExcelMain";
	
		// TODO Auto-generated method stub

	/*	ReadFromExcel ex= new ReadFromExcel();
		String filepath= "C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\src\\testdatasheet";
		ex.readexcel(filepath, "test data.xlsx", "testsel");
		*/
		DOMConfigurator.configure("log4j.xml");
		Logclass.startTestCase(TestcaseName);
		
		ReadDataExcelUtility rd=new ReadDataExcelUtility();
		rd.SetPath("C:\\\\Users\\\\Winy\\\\eclipse-workspace\\\\Selenium Automation\\\\src\\\\testdatasheet", "test data.xlsx", "testsel");
		 int numberofrow=rd.getrowcount("testsel");
		 System.out.println( "The number of rows in the Sheet are : "+numberofrow);
		 rd.getcelldata("testsel", numberofrow);
		 
		  for (int i=0;i<=numberofrow;i++)
		  {
			  
			  rd.getallcelldataofcol("testsel", i);
		  }
		 
		 
	Logclass.endTestCase(TestcaseName);}

}
