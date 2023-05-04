package boauiflip.driverfactory;

import org.openqa.selenium.WebDriver;

public class DriverManager {
	
	
	
	ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();
	
	public static DriverManager instance=new DriverManager();
	
	
	private DriverManager()
	{
		
	}
	
	public static DriverManager getInstance()
	{
		
		return instance;
	}
	
	
	public void setDriver(WebDriver localparam)
	{
		
		driver.set(localparam);
	}
	
	
	public WebDriver getDriver()
	{
		
		return driver.get();
	}
	
	
	public void removebrowser()
	{
		
		driver.get().quit();
		driver.remove();
		
	}
	

}
