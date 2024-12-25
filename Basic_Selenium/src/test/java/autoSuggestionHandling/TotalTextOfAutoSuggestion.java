package autoSuggestionHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TotalTextOfAutoSuggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		//  WATS to display all the text of autosuggestion as an output in google webpage 
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.google.com/"); 
		driver.findElement(By.name("q")).sendKeys("selenium"); 
		Thread.sleep(5000); 
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='G43f7e']/li")); 
		int size = list.size(); 
		System.out.println(size); 
		for(int i=0;i<size;i++) 
		{ 
		WebElement ele = list.get(i); 
		String str = ele.getText(); 
		System.out.println(str);
		}

	}

}
