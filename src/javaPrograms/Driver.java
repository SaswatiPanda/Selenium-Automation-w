package javaPrograms;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;

public class Driver {
	
	
	public static WebDriver driver=null;
	public static WebDriver driver1=null;
	
public static void launchBrowser(WebDriver driver) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	//WebDriver browser= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	driver.findElement(By.id("lst-ib")).sendKeys("Winy i love u");
	
	driver1= new ChromeDriver();
	
	driver1.get("https://www.amazon.com/ap/signin?accountStatusPolicy=P1&clientContext=259-0366620-0738477&language=en_US&openid.assoc_handle=amzn_prime_video_desktop_us&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.primevideo.com%2Fregion%2Feu%2Fauth%2Freturn%2Fref%3Dav_auth_ap%3F_encoding%3DUTF8%26location%3D%252Fregion%252Feu%252Fgp%252Fvideo%252Fsignup%252Fref%253Ddv_web_auth_no_re_sig");
	driver1.findElement(By.id("ap_email")).sendKeys("soumya");
	Thread.sleep(10000);
	driver1.close();
	
	//System.out.println(Text);
	
}
	
	
	
	
}


