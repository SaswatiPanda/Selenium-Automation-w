package keywordDrivenFramework;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtility {

	static XSSFWorkbook wb;
	static XSSFSheet sh;
	
	public static void setexcel(String path, int sheetnum)
	{
		File src = new File(path);
		FileInputStream fin;
		try {
			fin = new FileInputStream(src);
		
		wb = new XSSFWorkbook(fin);
		sh = wb.getSheetAt(sheetnum);
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} 
		} 
	
	public static  String getdata(int rownum, int cellnum)
	{
		String data = sh.getRow(rownum).getCell(cellnum).getStringCellValue();
		return data;
	
		
	}
	
}
