package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

// WATS to verify error message is displayed or not by entering invalid UN & Pwd

public class IsDisplayed {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jeeva");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@name='login']")).click();

		WebElement ele = driver.findElement(By.xpath("//div[starts-with(text(),'The password that you')]"));
        boolean b = ele.isDisplayed();
        
        if(b)
        {
        	System.out.println("Script pass");
        }
        else
        {
        	System.out.println("Script fail");
        }
		
		
	}

}
