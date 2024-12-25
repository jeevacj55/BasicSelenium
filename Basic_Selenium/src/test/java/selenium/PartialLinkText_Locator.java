package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//WATS to click on gmail link in google

public class PartialLinkText_Locator {

	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.google.com/webhp?authuser=1");
		 driver.findElement(By.partialLinkText("Gmail")).click();
		 Thread.sleep(4000);
		 driver.close();
	        
	}

}
