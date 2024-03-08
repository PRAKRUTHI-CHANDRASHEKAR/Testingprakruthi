package Parameters;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ParameterDemo {
	WebDriver driver;
	@BeforeTest
	public void OpenBrowser() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}
	@Parameters({ "username", "password" })
	@Test
	public void LoginCredentials(String username, String password) throws InterruptedException {
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector(" input[placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
 

	}
	@Test
	public void clickAdmin() throws Exception {
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']//span[1]")).click();
		Thread.sleep(5000);
	}
}