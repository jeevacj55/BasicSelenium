package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb3rdApproach {

	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver = new FirefoxDriver();
	        driver.get("https://www.facebook.com/");
	        driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
	        
	        
	        
	        WebElement year = driver.findElement(By.id("year")); 
	        Select s = new Select(year); 
	        s.selectByIndex(7); 
	        Thread.sleep(3000); 
	        s.selectByValue("2000"); 


	}

}
