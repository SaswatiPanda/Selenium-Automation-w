package javaPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTesting {

	
	
	public static WebDriver driver=null;
	public static WebDriver driver1=null;
	
public static void launchBrowser(WebDriver driver) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/guru99home/");
	
	driver.switchTo().frame("a077aa5e");
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath(".//*[@id='philadelphia-field-email']")).sendKeys("soumyawiny@gmail.com");
	driver.switchTo().frame("a077aa5e");
	Thread.sleep(3000);
	driver.findElement(By.xpath("html/body/a/img")).click();

	//WebDriver browser= new ChromeDriver();
	

}
}