package boauiflip.driverfactory;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import boauiflip.reportutilty.HighLevelreport;

public class TestBase extends HighLevelreport {
	
	public static WebDriver driver=null;
	
	@BeforeSuite
	public void initalizereportdata()
	{
		
		generateHTMLreport();
	}
	
	@AfterSuite
	public void savereportData()
	{
		
		savereport();
	}
	
	
	
	@BeforeMethod
	public void startTest()
	{
		
		driver=BrowserFactory.initalizeDriver();
		DriverManager.getInstance().setDriver(driver);
		driver=DriverManager.getInstance().getDriver();
	}
	
	@AfterMethod
	public void closeTest()
	{
		
	DriverManager.getInstance().removebrowser();
	}
	

}
