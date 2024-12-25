package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fliplart {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("redmi 9 active coral green 128gb");
		driver.findElement(By.xpath("//button[@class='_2SmNnR']")).click();
	    WebElement ele = driver.findElement(By.xpath("//div[contains(@class,'KzDlHZ')]//span[contains(text(),' Ratings')]"));
	}

}
