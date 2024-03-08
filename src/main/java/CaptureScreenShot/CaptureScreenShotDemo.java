package CaptureScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenShotDemo {

    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.myntra.com/");
        driver.manage().window().maximize();

        // Full Page ScreenShot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File trg = new File(".\\Screenshot\\fullPageScreenshot.png");
        FileUtils.copyFile(src, trg);

        // Section of the page
        WebElement section = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
        File src1 = section.getScreenshotAs(OutputType.FILE);
        File trg1 = new File(".\\Screenshot\\sectionScreenshot.png");
        FileUtils.copyFile(src1, trg1);

        driver.quit();
    }

}
