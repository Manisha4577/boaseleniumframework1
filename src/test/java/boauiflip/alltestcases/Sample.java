package boauiflip.alltestcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import boauiflip.driverfactory.TestBase;

public class Sample extends TestBase{
	
	@Test
	public void case1()
	{
		test=reports.createTest("case1");
		driver.get("https://www.google.com");
		
		test.log(Status.PASS, "case executed");
	}

}
