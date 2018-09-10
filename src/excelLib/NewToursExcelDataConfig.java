package excelLib;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewToursExcelDataConfig {

	XSSFWorkbook wb;
	XSSFSheet sheet1;
		public  NewToursExcelDataConfig(String ExcelPath)
		{
			
			File src= new File(ExcelPath);
			FileInputStream fin;
			try {
				fin = new FileInputStream(src);
				wb= new XSSFWorkbook(fin);
				
			}
			
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
	
	
	@SuppressWarnings("deprecation")
	public String getData(int sheetNumber, int row, int col)
	{
		String Data = null;
		try {
	
		sheet1= wb.getSheetAt(sheetNumber);
		Cell cell=sheet1.getRow(row).getCell(col);
		 //
	     cell.setCellType(Cell.CELL_TYPE_STRING);
         String data0= cell.getStringCellValue();
         Data=data0;
         }
		catch (Exception e)
		{
		System.out.println(e);
		}
		return Data;
		
	}

	public int getRowCount(int sheetIndex)
	{
		int row= wb.getSheetAt(sheetIndex).getLastRowNum();
		return row= row+1;
	}
}
