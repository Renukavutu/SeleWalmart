package baseLayer;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;


import utilityLayer.PropertyReader;

public class WebDriverLaunch extends baseWebPageDriver {
	
	PropertyReader reader;
	public static WebDriver driver;
	/*public WebDriverLaunch() {
		super(driver);
	}*/

	

	@BeforeTest
	public void setup()
	{
		
	System.out.println("Launching browser");
	 reader=new PropertyReader("C:\\Project\\Selenium_test\\SeleAssignment\\properties\\environment.properties", driver);
	 
	 String BROWSER= getvalues(driver,reader.get("browser"));
	
	 if (BROWSER.contentEquals("Chrome"))
	 {
		 System.setProperty("webdriver.chrome.driver", "src\\main\\java\\resources\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
			
			
			
	 }
	 
	 else if (BROWSER.contentEquals("IE"))
	 {
		 System.setProperty("webdriver.ie.driver", "src\\test\\java\\resources\\chromedriver.exe");
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			
	 }
	 
	
	 
	
	
	
	}
	
	
	
	
}
	


	
	
	



