package com.cg.ReadConfigFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class ReadConfPropFile {
static WebDriver driver;
public static void main(String[] args) throws IOException {
	Properties prop= new Properties();
	FileInputStream ip= new FileInputStream("C:\\Users\\AKSSRIVA\\OneDrive - Capgemini\\Desktop\\java\\seleniumdemos\\src\\main\\java\\com\\cg\\ReadConfigFile\\config.properties");
	prop.load(ip);
	System.out.println(prop.getProperty("name"));
	System.out.println(prop.getProperty("age"));
	System.out.println(prop.getProperty("num"));
	System.out.println(prop.getProperty("url"));
	String browserName=prop.getProperty("browserName");
	System.out.println(browserName);
	if(browserName.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if (browserName.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	else if (browserName.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	String url=prop.getProperty("url");
	driver.get(url);
	driver.findElement(By.name("login")).sendKeys(prop.getProperty("Email"));
	driver.findElement(By.name("passwd")).sendKeys(prop.getProperty("password"));
	driver.findElement(By.name("proceed")).click();
}
}