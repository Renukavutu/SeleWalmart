package fBPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseLayer.WebDriverLaunch;
import utilityLayer.PropertyReader;

public class FBLoginandout extends WebDriverLaunch {
	
	//public static WebDriver driver;
	
	PropertyReader Properties;
	
	/*public FBLoginandout(WebDriver driver) {
		super();
	}*/
	
	public void fblogin()  {
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
		WebDriverWait wait= new WebDriverWait(driver,30);
		
		
		Properties=new PropertyReader("C:\\Project\\Selenium_test\\SeleAssignment\\properties\\environment.properties", driver);
		
		WebElement usrname= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//INPUT[@id='email']")));
		usrname.sendKeys(getvalues(driver,Properties.get("username")));
				
		WebElement password=wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//INPUT[@id='pass']"))));
		
		password.sendKeys(getvalues(driver,Properties.get("password")));
		
	
		driver.findElement(By.xpath("//INPUT[@id='u_0_a']")).click();
		
		
		
	
    }
			
	public void message() {
		
				System.out.println("Hello World");
	}
	@Test
	public void log()
	{
		FBLoginandout login= new FBLoginandout();
		login.fblogin();
		login.message();
	}
}
