package com.cg.extentreport;
 
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;
 
import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class ExtentReportDemo1 {

	ExtentReports extent;

	WebDriver driver;
 
	@BeforeTest

	public void config() {

		ExtentSparkReporter htmlReporter = new ExtentSparkReporter(".\\ExtentReportsVVAutomation\\Reports1.html");

		htmlReporter.config().setReportName("VVAutomation");

		htmlReporter.config().setDocumentTitle("TestResult");
 
		extent = new ExtentReports();

		extent.attachReporter(htmlReporter);

		extent.setSystemInfo("Tester", "prakruthi");

	}
 
	@Test

	public void OpenGoogle() {
 
		ExtentTest test = extent.createTest("Google Site");

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		test.pass("Test start");

		driver.get("https://www.google.com/");

		test.pass("Google WebSite is Launched");

		driver.close();
 
	}

	@Test

	public void OpenFaceBook() {
 
		ExtentTest test = extent.createTest("FaceBook Site");

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		test.pass("FaceBook WebSite is Launched");

		driver.close();
 
	}

	@AfterTest

	public void tearDown() {

		extent.flush();

	}
 
}
