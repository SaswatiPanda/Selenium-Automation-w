package javaProgramExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstThread extends Thread{
	public static WebDriver driver=null;
	public void run(){
		
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.co.in/");
			driver.findElement(By.id("lst-ib")).sendKeys("Winy i love u");
		/*System.out.println("Start of first thread");
		for(int i=0;i<100;i++)
		{
			System.out.println("First thread is running");
			
		}
		System.out.println("End of first thread");*/
	}
}
