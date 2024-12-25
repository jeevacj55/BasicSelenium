package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FbAccount {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        
        driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click(); 
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jeeva");


	}

}
