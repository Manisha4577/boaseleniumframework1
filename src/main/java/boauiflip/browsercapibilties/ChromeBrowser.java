package boauiflip.browsercapibilties;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeOptions;

public class Chromebrowser extends BrowserCapibilties {
	
	
	public Chromebrowser()
	{
		
		
		setdownloadpath();
		
	}

	@Override
	void setdownloadpath() {
		
		
		Map<String, Object> prefs = new LinkedHashMap<String, Object>();         
        prefs.put("download.default_directory",System.getProperty("user.dir") + File.separator + "download");         
        // Adding capabilities to ChromeOptions
        ChromeOptions options = new ChromeOptions();  
        options.setExperimentalOption("prefs", prefs);
		
	}
	
	

}
