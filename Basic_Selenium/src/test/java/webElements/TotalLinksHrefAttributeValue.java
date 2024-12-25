package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TotalLinksHrefAttributeValue {

	public static void main(String[] args)
	{
		//WATS to display every link href attribute property  value as an output in google
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.google.com/"); 
		List<WebElement> ref = driver.findElements(By.xpath("//a")); 
		int s = ref.size(); 
		System.out.println("Total no. of links "+s); 
		for(int i=0;i<s;i++) 
		{ 
		WebElement ele = ref.get(i); 
		String str = ele.getAttribute("href"); 
		System.out.println(str); 
		}

	}

}
