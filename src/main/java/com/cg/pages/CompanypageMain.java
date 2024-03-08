package com.cg.pages;

import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class CompanypageMain {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriverManager.firefoxdriver().setup();
			WebDriver d = new FirefoxDriver();
			d.get("https://classic.freecrm.com/index.html");
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
			d.manage().deleteAllCookies();
 
		    CompanyPage np=new CompanyPage(d);
		    WebElement u=np.userName;
		    u.sendKeys("haneesh");
		    WebElement p=np.password;
		    p.sendKeys("haneeshgowda");
		    WebElement l=np.login;
		    l.click();
		    np.switchframe();
		    np.mouseactions();
		    WebElement cn=np.companyName;
		    cn.sendKeys("Capgemini");
		    WebElement ar=np.annualRevenue;
		    ar.sendKeys("100000");
		    WebElement ne=np.numOfEmployees;
		    ne.sendKeys("5000");
 
		    np.statusDropdownOptions("New");
		    np.categoryDropdownOptions("Partner");
		    np.priorityDropdownOptions("Medium");
		    np.sourceDropdownOptions("Import");
		    WebElement i=np.identifier;
		    i.sendKeys("67970-0");
		    WebElement vn=np.vatNumber;
		    vn.sendKeys("6248947204710");
		    WebElement ph=np.phone;
		    ph.sendKeys("8248953900");
		    WebElement e=np.email;
		    e.sendKeys("haneeshgowda@gmail.com");
		    WebElement pc=np.parentCompany;
		    pc.sendKeys("philips");
		    WebElement at=np.addressTitle;
		    at.sendKeys("My address");
		    WebElement a=np.address;
		    a.sendKeys("Mysuru");
		    WebElement c=np.city;
		    c.sendKeys("Bannur");
		    WebElement s=np.state;
		    s.sendKeys("Karnataka");
		    WebElement pco=np.postCode;
		    pco.sendKeys("628008");
		    WebElement co=np.country;
		    co.sendKeys("India");
		    WebElement t=np.tags;
		    t.sendKeys("Hi Hello Welcome");
		    WebElement ser=np.service;
		    ser.sendKeys("All services provided");
		    WebElement sav=np.save;
		    sav.click();
 
	}
}