package com.cg.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 
public class SignUP {
	WebDriver driver = null;
 
//public SignUp(WebDriver driver) {
//	this.driver = driver;
//	}
By FirstName = By.name("first_name");
By LastName = By.name("surname");
By Email = By.name("email");
By ConfirmEmail = By.name("email_confirm");
By UserName = By.name("username");
By Password = By.name("password");
By ConfirmPasword = By.name("passwordconfirm");
By clickSubmit = By.xpath("//div[@class='myButton']");
 
public void setFirstName(String first_name) {
	driver.findElement(FirstName).sendKeys(first_name);
}
 
public void setLastName(String surname) {
	driver.findElement(LastName).sendKeys(surname);
}
 
public void setEmail(String email) {
	driver.findElement(Email).sendKeys(email);
}
 
public void setConfirmEmail(String email_confirm) {
	driver.findElement(ConfirmEmail).sendKeys(email_confirm);
}
 
public void setUserName(String username) {
	driver.findElement(UserName).sendKeys(username);
}
 
public void setPassword(String password) {
	driver.findElement(Password).sendKeys(password);
}
 
public void clickSubmit() {
	driver.findElement(clickSubmit).click();
}
 
}
 