package javaPrograms;

import org.openqa.selenium.WebDriver;

public class TC1 {

	public static  WebDriver WebDriver = null;

	public static void main(String[] args) throws InterruptedException {
		//Driver NewDriver=new Driver();
		try {
		//Driver.launchBrowser(WebDriver);
		FirstSeleniumExample.launchBrowser(WebDriver);
	
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
