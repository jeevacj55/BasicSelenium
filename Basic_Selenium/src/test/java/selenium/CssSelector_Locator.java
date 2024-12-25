package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector_Locator {

	public static void main(String[] args)
	{
		 WebDriver driver = new FirefoxDriver();
		 driver.get("file:///C:/Users/jegat/Desktop/HTML%20files/cssSelector_Locator.html");
         driver.findElement(By.cssSelector("input[type='text']")).sendKeys("jeeva");
         driver.findElement(By.cssSelector("input[type='password']")).sendKeys("jeeva123");
         driver.findElement(By.cssSelector("input[type='checkbox']")).click(); 
         driver.findElement(By.cssSelector("input[type='button']")).click();
         //driver.close();
	}

}
