package dataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelSheet {

	public static void main(String[] args) throws IOException
	{
		File src= new File("C:\\Example\\ExcelData.xlsx");
		FileInputStream fin= new FileInputStream(src);
		
		XSSFWorkbook wb= new XSSFWorkbook(fin);
		wb.getSheetAt(0);
		XSSFSheet sheet1= wb.getSheetAt(0);
		
		String data0= sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from excel is " +data0);
		
		String data1= sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data from excel is " +data1);
		
		wb.close();

	
	}
}
