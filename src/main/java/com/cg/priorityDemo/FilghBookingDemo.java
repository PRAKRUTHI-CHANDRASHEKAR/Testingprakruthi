package com.cg.priorityDemo;

import org.testng.annotations.Test;

public class FilghBookingDemo {
 
	@Test(priority = -1)
	public void signup() {
 
		System.out.println("SignUp");
	}
 
	@Test(priority = 0)
	public void LogIn() {
		System.out.println("Login");
	}
 
	@Test(priority = 3)
	public void SearchForTheFlight() {
		System.out.println("SearchForTheFlight");
	}
 
	@Test(priority = 4)
	public void BookTheFlight() {
		System.out.println("BookTheFlight");
	}
 
	@Test(priority = 5)
	public void SaveTheTicket() {
		System.out.println("SaveTheTicket");
	}
 
	@Test(priority = 6)
	public void LogOut() {
		System.out.println("LogOut");
	}
 
}

