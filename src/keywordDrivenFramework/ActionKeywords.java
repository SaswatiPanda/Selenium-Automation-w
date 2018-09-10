package keywordDrivenFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionKeywords {

	public static WebDriver driver;
	
	public static void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	}
	
	public static void navigate()
	{
		driver.navigate().to("https://www.facebook.com/");
	}
	
	public static void credentials()
	{
		driver.findElement(By.cssSelector("#email")).sendKeys("testabc"); 
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("12345");
	}
	
	public static void login()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.id("u_0_2")));
		ele.click();
	}
}
