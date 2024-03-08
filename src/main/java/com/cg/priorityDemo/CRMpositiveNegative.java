package com.cg.priorityDemo;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CRMpositiveNegative {
	static WebDriver driver;
		@BeforeTest
		public void setup() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			WebDriver driver = new ChromeDriver();
			driver.get("https://classic.freecrm.com/index.html?e=1");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}	
			@Test(priority=1)
			public void CRMLogin_positive() {
				driver.findElement(By.name("username")).sendKeys("keerthi");
				driver.findElement(By.name("password")).sendKeys("keerthigowda");
				driver.findElement(By.xpath("//input[@value='Login']")).click();
				String crmTitle=driver.getTitle();
				String actualTitle="CRMPRO";
				assertEquals(crmTitle,actualTitle);
 
			}
			@Test(priority=2)
			public void CRMLoginNegative() {
				driver.findElement(By.name("username")).sendKeys("keerthi");
				driver.findElement(By.name("password")).sendKeys("keerthigowda");
				driver.findElement(By.xpath("//input[@value='Login']")).click();
				String crmTitle=driver.getTitle();
				String actualTitle=driver.getTitle();
				assertEquals(crmTitle,actualTitle);
 
			}
			@AfterTest
			public void LogOut() {
				System.out.println("LogOut");
 
			}
}	