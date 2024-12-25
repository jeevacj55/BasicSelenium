package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TotalLinksInGoogle {

	public static void main(String[] args) 
	{
		// WATS to identify total no. of links present in google webpage as an output
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.google.com/"); 
		List<WebElement> ref = driver.findElements(By.xpath("//a")); 
		int s = ref.size(); 
		System.out.println("Total no. of links "+s); 

	}

}
