package keyStroke;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookKeystroke {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		ele.sendKeys("jeeva");
		ele.sendKeys(Keys.CONTROL+"a");
		ele.sendKeys(Keys.CONTROL+"c");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Keys.CONTROL+"v");

	}

}
