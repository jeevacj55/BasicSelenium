package webTableHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DisplayAllContents 
{

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver(); 	 
		driver.get("file:///C:/Users/jegat/Desktop/HTML%20files/HandlingWebTables.html"); 
		List<WebElement> list = driver.findElements(By.xpath("//tr")); 
		for(int i=0;i<list.size();i++) 
		{ 
		WebElement ele = list.get(i); 
		String str = ele.getText(); 
		System.out.println(str);
		}
	}

}
