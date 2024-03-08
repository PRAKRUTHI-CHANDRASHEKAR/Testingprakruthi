package com.cg.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
 
public class CompanyPage {
	WebDriver d;
	Actions actions;
	public CompanyPage(WebDriver d) {
		this.d=d;
		this.actions=new Actions(d);
		PageFactory.initElements(d, this);
	}
	@FindBy(name="username")
	WebElement userName;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath=("//input[@value='Login']"))
	WebElement login;
	public WebElement userName() {
		return userName;
	}
	public WebElement password() {
		return password;
	}
	public WebElement login() {
		return login;
	}
	@FindBy(xpath=("//frame[@name='mainpanel']"))
	WebElement frame;
	public void switchframe(){
		d.switchTo().frame(frame);
	}
	@FindBy(xpath=("//a[normalize-space()='Companies']"))
	WebElement mouseOverElement;
	@FindBy(xpath=("//a[@title='New Company']"))
	WebElement mouseOverTop;
	public void mouseactions() {
		actions.moveToElement(mouseOverElement).moveToElement(mouseOverTop).click().perform();
	}
	@FindBy(xpath=("//input[@id='company_name']"))
	WebElement companyName;
	@FindBy(xpath=("//input[@id='annual_revenue']"))
	WebElement annualRevenue;
	@FindBy(xpath=("//input[@id='num_of_employees']"))
	WebElement numOfEmployees ;
	@FindBy(xpath=("//select[@name='status']"))
	WebElement status;
	public void statusDropdownOptions(String optionText) {
		Select dropdown= new Select(status);
		dropdown.selectByVisibleText(optionText);
	}
	@FindBy(xpath=("//select[@name='category']"))
    WebElement category;
	public void categoryDropdownOptions(String optionText) {
		Select dropdown=new Select(category);
		dropdown.selectByVisibleText(optionText);
	}
	@FindBy(xpath=("//select[@name='priority']"))
	WebElement priority;
	public void priorityDropdownOptions(String optionText) {
		Select dropdown=new Select(priority);
		dropdown.selectByVisibleText(optionText);
	}
	@FindBy(xpath=("//select[@name='source']"))
	WebElement source;
	public void sourceDropdownOptions(String optionText) {
		Select dropdown=new Select(source);
		dropdown.selectByVisibleText(optionText);
	}
	@FindBy(xpath=("//input[@name='identifier']"))
	WebElement identifier;
	@FindBy(xpath=("//input[@id='vat_number']"))
	WebElement vatNumber;
	@FindBy(xpath=("//input[@id='phone']"))
	WebElement phone;
	@FindBy(xpath=("//input[@id='email']"))
	WebElement email;
	@FindBy(xpath=("//input[@name='client_lookup']"))
	WebElement parentCompany;
	@FindBy(xpath=("//input[@name='address_title']"))
	WebElement addressTitle;
	@FindBy(xpath=("//textarea[@name='address']"))
	WebElement address;
	@FindBy(xpath=("//input[@name='city']"))
	WebElement city;
	@FindBy(xpath=("//input[@name='state']"))
	WebElement state;
	@FindBy(xpath=("//input[@name='postcode']"))
	WebElement postCode;
	@FindBy(xpath=("//input[@name='country']"))
	WebElement country;
	@FindBy(xpath=("//input[@id='tags']"))
	WebElement tags;
	@FindBy(xpath=("//textarea[@id='service']"))
	WebElement service;
	@FindBy(xpath=("//tbody/tr[8]/td[1]/input[1]"))
	WebElement save;
 
	public WebElement companyName() {
		return companyName;
	}
	public WebElement annualRevenue() {
		return annualRevenue;
	}
	public WebElement numOfEmployees() {
		return numOfEmployees;
	}
	public WebElement identifier() {
		return identifier;
	}
	public WebElement vatNumber() {
		return vatNumber;
	}
	public WebElement phone() {
		return phone;
	}
	public WebElement email() {
		return email;
	}
	public WebElement parentCompany() {
		return parentCompany;
	}
	public WebElement addressTitle() {
		return addressTitle;
	}
	public WebElement address() {
		return address;
	}
	public WebElement city() {
		return city;
	}
	public WebElement state() {
		return state;
	}
	public WebElement postCode() {
		return postCode;
	}
	public WebElement country() {
		return country;
	}
	public WebElement tags() {
		return tags;
	}
	public WebElement service() {
		return service;
	}
	public WebElement save() {
		return save;
	}
 
}
