package autoSuggestionHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TotalAutoSuggestions {

	public static void main(String[] args) throws InterruptedException
	{
		//  WATS to display total no. of Autosuggestion displayed as an output in Google webpage 
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.google.com/"); 
		driver.findElement(By.id("APjFqb")).sendKeys("selenium"); 
		Thread.sleep(5000); 
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='G43f7e']/li")); 
		int size = list.size(); 
		System.out.println(size); 

	}

}
