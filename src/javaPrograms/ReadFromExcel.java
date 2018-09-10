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

public class ReadFromExcel {

	public void readexcel(String Filepath, String Filename, String Sheetname) throws IOException
	{
		File f= new File(Filepath+"\\"+Filename);
		FileInputStream fin= new FileInputStream(f);
		
		Workbook wb= null;
		//Sheet sh1= null;
		Cell cl=null;
		String file_extn= Filename.substring(Filename.indexOf("."));
		try {
		if(file_extn.equals(".xlsx"))
		{
			wb= new XSSFWorkbook(fin);
			
		}
		else if(file_extn.equals(".xls"))
		{
			wb= new HSSFWorkbook(fin);
			
		}
		Sheet sh= wb.getSheet(Sheetname);
		int rowcount= sh.getLastRowNum()-sh.getFirstRowNum();
		for(int i= 0; i<rowcount+1; i++)
		{
			Row r= sh.getRow(i);
			for(int j=0; j<r.getLastCellNum(); j++)
			{
				//System.out.println(r.getCell(j).g+"||");
				cl=sh.getRow(i).getCell(j);
				System.out.print(cl+"||")		;
			}
		}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
