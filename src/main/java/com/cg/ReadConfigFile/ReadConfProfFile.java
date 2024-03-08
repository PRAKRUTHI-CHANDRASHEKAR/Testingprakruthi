package com.cg.ReadConfigFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class ReadConfProfFile {
 
	static WebDriver driver;
 
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
 
		FileInputStream ip = new FileInputStream(
				"C:\\java\\TestNg\\src\\main\\java\\com\\cg\\ReadConfigFile\\config.properties");
 
		
		System.out.println(prop.getProperty("url"));
 
		String browserName = prop.getProperty("browserName");
		System.out.println(browserName);
 
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
 
		String url = prop.getProperty("url");
		driver.get(url);
 
		driver.findElement(By.name("login")).sendKeys(prop.getProperty("Email"));
		driver.findElement(By.name("passwd")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.name("proceed")).click();
 
	}
 
}
