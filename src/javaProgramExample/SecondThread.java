package javaProgramExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondThread extends Thread{

	public static WebDriver browser= null;
	public void run()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\Driver\\chromedriver.exe");
		browser=new ChromeDriver();
		browser.manage().window().maximize();
		browser.get("https://www.google.co.in/");
		browser.findElement(By.id("lst-ib")).sendKeys("Winy i love u");
		
		/*System.out.println("Start of the second thread");
		for(int i=0;i<100;i++)
		{
			System.out.println("Second thread is running" + i);
		}
		System.out.println("End of second thread");*/
	}
}
