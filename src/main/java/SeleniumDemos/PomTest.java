package SeleniumDemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cg.POM.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PomTest {

	WebDriver driver;

	@BeforeTest
	public void setUp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.manage().deleteAllCookies();
		// new LoginPage(driver);
	}

	@Test
	public void crmLogin() {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName("shivucrm");
		lp.setPassword("freecrm");
		lp.clickLogin();
	}

}