package utilityLayer;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


import org.openqa.selenium.WebDriver;

//import com.unitedinternet.portal.selenium.utils.logging.LoggingSelenium;

public class PropertyReader  {
	private Properties properties;
	private String fileName;
	WebDriver driver;
	
	public PropertyReader(String fileName,WebDriver driver){
	try{
		this.fileName = fileName;
		this.properties = new Properties();
		this.driver=driver;
		init();
		
	}catch(Exception e){
		e.printStackTrace();
		
	}
	}
	
	private void init(){
		try {
			properties.load(new FileInputStream(new File(fileName)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String get(String key) {
		
		try{
		if(properties.getProperty(key)==null)
			System.out.println("Key not found");
		else
		    return properties.getProperty(key);
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return key;
	}
}