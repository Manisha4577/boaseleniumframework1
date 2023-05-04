package boauiflip.reportutilty;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import boauiflip.commonfunctionutilty.CommonFunction;

public class HighLevelreport {
	
	
	public static ExtentReports reports;
	public static ExtentTest test;
	public static ExtentSparkReporter htmlreporter;
	
	
	public void generateHTMLreport()
	{
		
		long milisecond=System.currentTimeMillis();
		String path=System.getProperty("user.dir")+"\\automationreport\\report"+milisecond+".html";
		try {
			
			htmlreporter=new ExtentSparkReporter(path);
			reports=new ExtentReports();
			reports.attachReporter(htmlreporter);
			String username=System.getProperty("user.name");
			String osname=System.getProperty("os.name");
			reports.setSystemInfo("username", username);
			reports.setSystemInfo("osname", osname);
			reports.setSystemInfo("browser", CommonFunction.readEnviornmentFile("browser"));
			
			htmlreporter.config().setDocumentTitle("BOA Automation Report");
			htmlreporter.config().setTheme(Theme.STANDARD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void savereport()
	{
		
	reports.flush();
	
	}
	
	
	
	
	

}
