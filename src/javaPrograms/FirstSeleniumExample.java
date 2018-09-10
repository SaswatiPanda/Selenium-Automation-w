package javaPrograms;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstSeleniumExample {
	
	public static WebDriver driver= null;
	public static void launchBrowser(WebDriver driver)
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		
		
		
		
		driver.get("https://in.search.yahoo.com/");
		//driver.navigate().to(arg0);
		String x= driver.getTitle();
		System.out.println(x);
		String x1= driver.getPageSource();
		System.out.println(x1);
		driver.findElement(By.id("yschsp")).sendKeys("Wonder Woman");
		driver.findElement(By.xpath("//*[@id='sf']/button")).click();
		
	}
}
