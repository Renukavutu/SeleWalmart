package wallethubrating;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import baseLayer.WebDriverLaunch;
import utilityLayer.PropertyReader;



public class wallethubtest extends WebDriverLaunch {
	
	

	PropertyReader Properties;
	
	/*public FBLoginandout(WebDriver driver) {
		super();
	}*/
	
	@Test
	public void wallethubrating() throws InterruptedException {
		
		driver.get("https://wallethub.com/profile/test-insurance-company-13732055i");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.switchTo().frame(1);
		
		
		
		/*JavascriptExecutor js= (JavascriptExecutor) driver;
		WebElement startRating= driver.findElement(By.xpath("//*[@id=\"reviews-section\"]/div[1]/div[3]/review-star/div"));
		
		
		js.executeScript("arguments[0].scrollIntoView(true)", startRating);*/
		
		Actions action= new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"reviews-section\"]/div[1]/div[3]/review-star/div/svg[5]")));
		
		action.click().build().perform();
		
		
		//
		Thread.sleep(10000);
		//startRating.click();
		
			
		Properties=new PropertyReader("C:\\Project\\Selenium_test\\SeleAssignment\\properties\\environment.properties", driver);
		Thread.sleep(10000);
		//driver.findElement(By.cssSelector("//#reviews-section/div.review-stat-box/div.review-action.ng-enter-element/review-star/div/svg:nth-child(4)/")).click();
		
	
    }
		
		
		
		
		
	
    }

