package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TagName_Locator 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///c:/Users/jegat/Desktop/HTML%20files/TagName_Locator.html");
		//By un = By.tagName("input");
		//WebElement ele = driver.findElement(un);
		//ele.sendKeys("admin");
		
		WebElement ele = driver.findElement(By.tagName("input"));
        ele.sendKeys("admin");
        Thread.sleep(5000);
        
        ele.clear();
        
	}

}
