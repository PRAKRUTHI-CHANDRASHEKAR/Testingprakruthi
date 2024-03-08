package com.cg.POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.cg.POM.LoginPage;

 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class PomTest {
 
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.manage().deleteAllCookies();
 
		LoginPage lp = new LoginPage(driver);
 
		lp.setUserName("prakcrm");
		lp.setPassword("freecrm");
		lp.clickLogin();
 
	}
  
}
