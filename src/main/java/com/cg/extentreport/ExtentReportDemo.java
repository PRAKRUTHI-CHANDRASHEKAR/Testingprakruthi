package com.cg.extentreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class ExtentReportDemo {
 
	public static void main(String[] args) {
		// ExtentHtmlReporter html = new
		// ExtentHtmlReporter(".\\ExtentReportsVVAutomation\\Report.html");
 
		 ExtentSparkReporter html = new ExtentSparkReporter(".\\ExtentReportsVVAutomation\\reportdemo.html");
		//ExtentSparkReporter html = new ExtentSparkReporter(null)
		html.config().setDocumentTitle("VVAutomation Extent Report");
		html.config().setReportName("Sample Automation Report");
		html.config().setTheme(Theme.DARK);
		// Create extentReports and attach reports
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);

 
		ExtentTest test = extent.createTest("FaceBookLogin_Positive_Test_Cases");
 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
 
		test.info("start test");
		driver.get("http://www.google.com");
		test.info("test ends");

 
		extent.flush();
 
	}
 
}