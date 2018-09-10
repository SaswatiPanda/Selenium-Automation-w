package javaPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataExcelUtility {
	
	Workbook wb= null;
	Sheet Sh=null;
	

	public void SetPath(String Filepath, String Filename, String Sheetname) throws IOException
	{
		File f= new File(Filepath+"\\"+Filename);
		FileInputStream fin= new FileInputStream(f);
		
		
		//Sheet sh1= null;
		Cell cl=null;
		String file_extn= Filename.substring(Filename.indexOf("."));
		try {
		if(file_extn.equals(".xlsx"))
		{ 
			wb= new XSSFWorkbook(fin);
			Logclass.info("The workbook type was validatated to be xlsx");
		}
		else if(file_extn.equals(".xls"))
		{
			wb= new HSSFWorkbook(fin);
			
		}
		Sheet sh= wb.getSheet(Sheetname);
		
		}
		catch (Exception e)
		{
			System.out.println(e);
			Logclass.error("The sheet name was not found");
		}
	}
	public  int getrowcount(String Sheetname) 
	{
		Sheet sh= wb.getSheet(Sheetname);
		int rowcount= sh.getLastRowNum()-sh.getFirstRowNum();
		Logclass.info("The row count was returned");
		return rowcount;
	}
	
/*	public int getRowCount(int Sheetindex)
	{
		int row= wb.getSheetAt(Sheetindex).getLastRowNum();
		row=row +1;
		
		return row;
	}
	
*/
	public void getallcelldataofcol(String Sheetname,int row)
	{
		Sheet sh= wb.getSheet(Sheetname);
	
		
			Row r= sh.getRow(row);
		
				//System.out.println(r.getCell(j).g"||");
				 Cell cl=sh.getRow(row).getCell(0);
				System.out.println(cl+"||")		;
				Logclass.info("cell data was retrived");
			
		}

	
	public void getcelldata(String Sheetname,int rowcount)
	{
		Sheet sh= wb.getSheet(Sheetname);
	
		for(int i= 0; i<rowcount+1; i++)
		{
			Row r= sh.getRow(i);
			for(int j=0; j<r.getLastCellNum(); j++)
			{
				//System.out.println(r.getCell(j).g+"||");
				 Cell cl=sh.getRow(i).getCell(j);
				System.out.print(cl+"||");
			}
		}
	}}
	

