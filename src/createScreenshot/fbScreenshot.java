package createScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fbScreenshot {

	@Test
	public void captureScreenshot() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("abcd");;
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File f= ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(f, new File("./Screenshots/facebook.png"));
		
		System.out.println("Screenshot taken of facebook login page");
		driver.quit();
	}
	
}
