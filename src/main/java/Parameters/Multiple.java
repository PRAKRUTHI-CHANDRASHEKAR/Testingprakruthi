package Parameters;
 
import org.testng.annotations.Parameters;

import org.testng.annotations.Test;
 
public class Multiple {

	@Test

	@Parameters({ "val1", "val2" })
 
	public void sum(int val1, int val2) {

		int sum = val1 * val2;
 
		System.out.println("The Multiplication of two number is:" + sum);

	}
 
}

