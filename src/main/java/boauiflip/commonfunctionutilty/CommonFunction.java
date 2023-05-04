package boauiflip.commonfunctionutilty;

import java.io.FileInputStream;
import java.util.Properties;

public class CommonFunction {
	
	
	
	
	
	
	
	
	public static String readEnviornmentFile(String key)
	{
		String value="";
		String path=System.getProperty("user.dir")+"\\src\\main\\java\\boauiflip\\enviornmentproperties\\QAEnv.properties";
		try {
			
			FileInputStream file=new FileInputStream(path);
			Properties prop=new Properties();
			prop.load(file);
			value=prop.getProperty(key);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
		
		
		
		
		
	}

}
