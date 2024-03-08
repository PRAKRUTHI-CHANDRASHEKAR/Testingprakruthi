package BrokenLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class BrokenLonkDemo {

 
	public static void main(String[] args) throws MalformedURLException, IOException {
		  String url=null;
		HttpURLConnection conn=null;
		WebDriverManager.chromedriver().setup();
 
		WebDriver driver = new ChromeDriver();
 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
 
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		System.out.println("Number of links are :=" + links.size());
 
		for (WebElement link : links) {
 
			url = link.getAttribute("href");
			 conn = (HttpURLConnection)(new URL(url).openConnection());
			conn.setRequestMethod("HEAD");
			conn.connect();
			int resCode = conn.getResponseCode();
			System.out.println(resCode);
			if (resCode > 400) {
				System.out.println("The link with text " + link.getText() + "is broken with code" + resCode);
			}
 
		}
 
	}
 
}