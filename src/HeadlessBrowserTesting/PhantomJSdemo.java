package HeadlessBrowserTesting;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class PhantomJSdemo {

	@Test
	public static void verifyFbTitle()
	{
		File src = new File("C:\\Users\\Winy\\eclipse-workspace\\PhantomJS\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
		
		WebDriver driver = new PhantomJSDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		System.out.println("Title is verified");
		Utility.captureScreenshot(driver,"PhantomJSDriverExample");
		
		System.out.println("Screenshot is captured");
		
		
	}
		
		
}
