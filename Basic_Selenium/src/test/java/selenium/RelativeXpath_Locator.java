package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class RelativeXpath_Locator {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/jegat/Desktop/HTML%20files/RelativeXpath_Locator.html");
		 driver.findElement(By.xpath("//input[1]")).sendKeys("jeeva");
		 driver.findElement(By.xpath("//input[2]")).sendKeys("ganesh");
		 driver.findElement(By.xpath("//input[3]")).sendKeys("jeeva123");
		 driver.findElement(By.xpath("//input[4]")).sendKeys("jeeva@gmail.com");
		 Thread.sleep(4000);
		 driver.close();
	}

}
