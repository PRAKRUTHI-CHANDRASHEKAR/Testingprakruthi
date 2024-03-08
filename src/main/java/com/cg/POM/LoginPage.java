package com.cg.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 
public class LoginPage {
 
	WebDriver driver = null;

 
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
 
	By userName = By.name("username");
	By passWord = By.name("password");
	By clickLogin = By.xpath("//input[@value='Login']");
 
	public void setUserName(String username) {
		driver.findElement(userName).sendKeys(username);
	}
 
	public void setPassword(String password) {
		driver.findElement(passWord).sendKeys(password);
	}
 
	public void clickLogin() {
		driver.findElement(clickLogin).click();
	}
 
}