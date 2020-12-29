package com.automation.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.helper.TestBase;

public class DataProviderTest extends TestBase {
 
    @DataProvider(name = "dataMethod")
    public static Object[][] dataMethod() {
    	System.out.println("Data Provider Method");
        return new Object[][] { { 0 }, { 1 } };
    }

	@Test(priority = 1)
	public void FBLogin() throws Exception {
		System.out.println("Test Method");
	}

}
 
<! Github work flows are being practiced ! Pulling to Eclipse !
