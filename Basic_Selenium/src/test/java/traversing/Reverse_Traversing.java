package traversing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Reverse_Traversing {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/jegat/Desktop/HTML%20files/Traversing.html");
        
		//to navigate from username to html
		//method1
		//driver.findElement(By.xpath("//input[@type='text']/../../.."));
		//or
		//driver.findElement(By.xpath("//input[@type='text']/..(div)/..(body)/..(html)"));
		
		//method2
		//driver.findElement(By.xpath("//input[@type='text']/parent::div/parent::body/parent::html"));
		
		//method3
		driver.findElement(By.xpath("//input[@type='text']/ancestor::html"));
		
		
		
	}

}
