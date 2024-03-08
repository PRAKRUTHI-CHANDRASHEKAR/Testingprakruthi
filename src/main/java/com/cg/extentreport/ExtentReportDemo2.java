package com.cg.extentreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportDemo2 {

	ExtentReports extent;
	WebDriver driver;

	@BeforeTest
	public void config() {

		ExtentSparkReporter htmlReporter = new ExtentSparkReporter(".\\ExtentReportsVVAutomation\\Reports2.html");
		htmlReporter.config().setReportName("VVAutomation3");
		htmlReporter.config().setDocumentTitle("TestResult3");

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Tester", "prakruthi");
	}

	@Test

	public void FreeCRM() {
		ExtentTest test = extent.createTest("Free CRM");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		test.pass("Test start");
		driver.get("https://classic.freecrm.com/index.html?e=1");
		test.pass("free crm login");
		test.log(Status.PASS, "Test Pass");
		test.log(Status.INFO, "Testcase info");
		test.log(Status.SKIP, "Testcase skip");
		test.log(Status.WARNING, "Tetscase warning");
		driver.close();
	}
}
