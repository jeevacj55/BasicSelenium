package keyStroke;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fb_BackspaceKeyStroke {

	public static void main(String[] args) throws InterruptedException
	{
		//WATS to enter text in firstname and remove the text using only backspace 
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	//or
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		ele.sendKeys("jeeva");
		Thread.sleep(4000);
		ele.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(4000);
		ele.sendKeys(Keys.BACK_SPACE);
		driver.close();
		

	}

}
