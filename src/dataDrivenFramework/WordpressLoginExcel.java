package dataDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import excelLib.ExcelDataonfig;

public class WordpressLoginExcel {
	
	public static WebDriver driver= null;
	
	@Test(dataProvider="Demodata")
	public static void Logintopage(String username, String password) throws IOException
	{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\Driver\\chromedriver.exe");
	driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://newtours.demoaut.com/");
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	driver.findElement(By.xpath("//input[@name='login']")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(driver.getTitle());
	Assert.assertTrue(driver.getTitle().contains("Find a Flight"));
	System.out.println("PAGE TITLE IS VERIFIED!");
	}
	
	@AfterMethod //tear down
	public static void closeBrowser()
	{
		driver.close();
	}
	
	@DataProvider(name="Demodata")
	public Object[][] getData() throws Exception
	{
		ExcelDataonfig ex= new ExcelDataonfig("C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\TestDataSheet\\ExcelDataNew.xlsx");
		int rows= ex.getRowCount(0); 
		Object[][] data= new Object[rows][2];
		
		for(int i=0; i< rows; i++)
		{
			data[i][0]= ex.getData(0, i, 0);
			data[i][1]= ex.getData(0, i, 1);
			
		}
	
		
		return data;
		
	}
	
	
}
