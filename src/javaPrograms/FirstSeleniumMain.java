package javaPrograms;

import org.openqa.selenium.WebDriver;

public class FirstSeleniumMain {

	private static  WebDriver WebDriver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
