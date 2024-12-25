package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByContains_Locator {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jeeva@gmail.com"); 
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("jeeva123");
		Thread.sleep(4000);
		//using contains method for email and password field(both fields are not dynamic so not necessary using contains method
		//driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("jeeva@gmail.com");
		//driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("jeeva123");
		
		//using contains method bcoz id attribute value is dynamic
		driver.findElement(By.xpath("//button[contains(@id,'u_0_5')]")).click();
		
	}

}
