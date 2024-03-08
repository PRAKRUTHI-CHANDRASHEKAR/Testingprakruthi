package Parameters;

import org.testng.annotations.Parameters;

import org.testng.annotations.Test;
 
public class Addition {

	@Test

	@Parameters({ "a1", "a2" })
 
	public void sum(int a1, int a2) {

		int sum = a1 + a2;
 
		System.out.println("The Addition of two number is:" + sum);

	}
 
}