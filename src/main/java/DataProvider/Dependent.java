package DataProvider;

import org.testng.annotations.Test;

public class Dependent {
	@Test
	public void Sigin() {
		System.out.println("SigIn");
	}
	@Test
	public void OpenBrwoser() {
		System.out.println("OpenBrwoser");
	}
	@Test
	public void LogOut() {
		System.out.println("LogOut");
	}
 
}
 
//(dependsOnMethods = {"Sigin"})
