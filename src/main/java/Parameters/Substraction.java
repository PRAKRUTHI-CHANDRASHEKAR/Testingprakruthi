package Parameters;


import org.testng.annotations.Parameters;

import org.testng.annotations.Test;
 
public class Substraction {

	@Test

	@Parameters({ "n1", "n2" })
 
	public void sum(int n1, int n2) {

		int sub = n1 - n2;
 
		System.out.println("The Substraction of two number is:" + sub);

	}
 
}
