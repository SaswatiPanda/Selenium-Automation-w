package dataDrivenFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import excelLib.NewToursExcelDataConfig;

public class NewDemoToursExcel {
	
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
	}
	
	@DataProvider(name= "ThisisData")
	public Object[][] getData() throws Exception
	{
		NewToursExcelDataConfig ex= new NewToursExcelDataConfig("C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\src\\testdatasheet\\ExcelData.xlsx");
		int rows= ex.getRowCount(1); 
		Object[][] data= new Object[rows][10];
		
		for(int i=1; i< rows; i++)
		{ 
			data[i][0]= ex.getData(1, i, 0);
			data[i][1]= ex.getData(1, i, 1);
			data[i][2]= ex.getData(1, i, 2);
			data[i][3]= ex.getData(1, i, 3);
			data[i][4]= ex.getData(1, i, 4);
			data[i][5]= ex.getData(1, i, 5);
			data[i][6]= ex.getData(1, i, 6);
			data[i][4]= ex.getData(1, i, 7);
			data[i][5]= ex.getData(1, i, 8);
			data[i][6]= ex.getData(1, i, 9);
		}
		return data;
	
		
	}
	
	@Test(dataProvider="ThisisData")
	public void newTours(String firstname, String lastname, String phone, String email, String address, String city, String country, String UserName, String Password, String ConfirmPassword)
	{
	
		driver.findElement(By.xpath("//input[contains(@name,'first')]")).clear();
		driver.findElement(By.xpath("//input[contains(@name,'first')]")).sendKeys(firstname);
		
		driver.findElement(By.xpath("//input[contains(@name,'last')]")).clear();
		driver.findElement(By.xpath("//input[contains(@name,'last')]")).sendKeys(lastname);
		
		driver.findElement(By.cssSelector("input[name='phone']")).clear();
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys(phone);
		
		driver.findElement(By.cssSelector("input#userName")).clear();
		driver.findElement(By.cssSelector("input#userName")).sendKeys(email);
		
		driver.findElement(By.xpath("//input[@name='address1']")).clear();
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(address);
		
		driver.findElement(By.xpath("//input[@name='city']")).clear();
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println("Hiiii");
		
		Select select = new Select(driver.findElement(By.name("country")));
		select.selectByValue(country);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("input#email")).clear();
		driver.findElement(By.xpath("input#email")).sendKeys(UserName);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("input[name=\'password\']")).clear();
		driver.findElement(By.cssSelector("input[name=\'password\']")).sendKeys(Password);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("//input[@name='confirmPassword']")).clear();
		driver.findElement(By.cssSelector("//input[@name='confirmPassword']")).sendKeys(ConfirmPassword);
		
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.close();
		driver.quit();
	}

}
