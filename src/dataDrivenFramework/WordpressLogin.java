package dataDrivenFramework;


//by Object return type

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import excelLib.ExcelDataonfig;

public class WordpressLogin {
	
	public static WebDriver driver= null;
	@Test(dataProvider="Demodata")
	public static void Logintopage(String username, String password) throws InterruptedException
	{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\Driver\\chromedriver.exe");
	driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://newtours.demoaut.com/");
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	driver.findElement(By.xpath("//input[@name='login']")).click();
	
	Thread.sleep(5000);
	System.out.println(driver.getTitle());
	Assert.assertTrue(driver.getTitle().contains("Find a Flight"));
	System.out.println("PAGE TITLE IS VERIFIED!");
	}
	
	@DataProvider(name="Demodata")
	public Object[][] getData()
	{
	
		Object[][] data= new Object[3][2];
		data[0][0]= "admin1";
		data[0][1]= "demo1";
		data[1][0]= "admin2";
		data[1][1]= "demo2";
		data[2][0]= "saswatibprkp@gmail.com";
		data[2][1]= "Demo@123";
	
		
		return data;
		
	}
	
	@AfterMethod //tear down
	public static void closeBrowser()
	{
		driver.close();
	}
}
