package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByStartsWith_Locator {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[starts-with(@id,'email')]")).sendKeys("jeeva@gmail.com"); 
		driver.findElement(By.xpath("//input[starts-with(@id,'pass')]")).sendKeys("jeeva123");

	}

}
