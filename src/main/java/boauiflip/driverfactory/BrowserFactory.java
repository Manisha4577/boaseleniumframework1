package boauiflip.driverfactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import boauiflip.commonfunctionutilty.CommonFunction;

public class BrowserFactory {
	
	
	
	
	
	public static WebDriver initalizeDriver()
	{
		WebDriver driver=null;
		
		
		String browserName=CommonFunction.readEnviornmentFile("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("edge"))
		{
			
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return driver;
		
		
		
	}
	
	
	
	

}
