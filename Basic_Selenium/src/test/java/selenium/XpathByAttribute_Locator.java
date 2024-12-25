package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByAttribute_Locator {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/jegat/Desktop/HTML%20files/xpathByAttribute_Locator.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("jeeva");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("jeeva123");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@type='button']")).click();
        Thread.sleep(4000);
        driver.close();
        
     
	}

}
