package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbsoluteXpath_Locator {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/jegat/Desktop/HTML%20files/AbsoluteXpath_Locator.html");
		
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("jeeva");
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("ganesh");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("jeeva123");
		driver.findElement(By.xpath("/html/body/input[4]")).sendKeys("jeeva456");
		
		Thread.sleep(4000);
		driver.close();

		
	}

}
