package dynamicElementsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicRealtime2 {

	public static void main(String[] args) throws InterruptedException
	{
     // WATS to display price of redmi 9 activ coral green 128 gb as an output in flipkart
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("redmi 9 activ coral green 128 gb");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement ele = driver.findElement(By.xpath("//div[@class='cN1yYO']"));
		String str = ele.getText();
		System.out.println(str);
		driver.close();


		
	}

}
