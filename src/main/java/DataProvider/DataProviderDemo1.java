package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
public class DataProviderDemo1
{
    @DataProvider (name = "login")
     public Object[][] dpMethod(){
	 return new Object[][] {{"First-Value"}, {"Second-Value"},{"thrid-value"}};
     }
    @Test (dataProvider = "login")
    public void myTest (String val) {
        System.out.println("Passed Parameter Is : " + val);
    }
}
