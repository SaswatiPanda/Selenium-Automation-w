package HeadlessBrowserTesting;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;


public class VerifyTitle {

	@Test
	public static void verifyFbTitle()
	{
		WebDriver driver = new HtmlUnitDriver();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		
	}
}
