package com.cg.VVAutomationTest.TestNg;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class CRMLogin {
 
	static WebDriver driver;
 
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
 
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}
 
	@Test
	public void checkTitle() {
		String googleTitle = driver.getTitle();
 
		String actualTitle = "Google";
 
		assertEquals(googleTitle, actualTitle);
	}
 
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Closing all the opened Resources");
	}
 
}