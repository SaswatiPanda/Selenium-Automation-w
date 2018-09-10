package javaPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickOnSearch {
	public static void clickonsearch(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.partialLinkText("Goolgle")).click();
		Thread.sleep(3000);	
		driver.close();
		System.out.println("thisis method from class 2");
	}

}
