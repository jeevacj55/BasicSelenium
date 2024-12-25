package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DisplayAllLinksText {

	public static void main(String[] args)
	{
		WebDriver driver= new FirefoxDriver(); 
		driver.get("file:///C:/Users/jegat/Desktop/HTML%20files/findElements(all%20links).html"); 
		//print link1 text 
		WebElement ele = driver.findElement(By.id("L1")); 
		String str = ele.getText(); 
		System.out.println(str); 
		//print all link text 
		List<WebElement> ref = driver.findElements(By.tagName("a")); 
		for(int i=0;i<ref.size();i++) 
		{ 
		WebElement ele1 = ref.get(i); 
		String str1 = ele1.getText(); 
		System.out.println(str1); 
		}

	}

}
