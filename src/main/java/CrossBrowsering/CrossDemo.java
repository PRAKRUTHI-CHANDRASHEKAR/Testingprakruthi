package CrossBrowsering;
 
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Parameters;

import org.testng.annotations.Test;
 
public class CrossDemo {

	WebDriver driver;

	@Test

	@Parameters({"browserName"})

	public void CrossBrowser(String Name)

	{

		if(Name.equalsIgnoreCase("chrome"))

		{

			driver=new ChromeDriver();

			driver.get("https://www.javatpoint.com/java-tutorial");

		}

		else if(Name.equalsIgnoreCase("edge"))

		{

			driver=new EdgeDriver();

			driver.get("https://www.javatpoint.com/java-tutorial");

		}

		else if(Name.equalsIgnoreCase("firefox"))

		{

			driver=new FirefoxDriver();

			driver.get("https://www.javatpoint.com/java-tutorial");

		}

	}
 
}
