package dataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException
	{
		File src= new File("C:\\Example\\ExcelData.xlsx");
		FileInputStream fin= new FileInputStream(src);
		
		XSSFWorkbook wb= new XSSFWorkbook(fin);
		wb.getSheetAt(0);
		XSSFSheet sheet1= wb.getSheetAt(0);
		int rowcount= sheet1.getLastRowNum();
		System.out.println("Total rows are=" +rowcount);
		
		for(int i=0; i<rowcount; i++)
		{
			String data= sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Data from Row"+ i+ data);
		}
		
		
		
	
	}
}
