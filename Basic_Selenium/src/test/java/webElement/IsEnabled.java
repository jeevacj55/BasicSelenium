package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsEnabled {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/jegat/Desktop/HTML%20files/isEnabledMethod.html");
		boolean status = driver.findElement(By.id("user")).isEnabled(); 
		boolean status1 = driver.findElement(By.id("pass")).isEnabled(); 
		if(status) 
		{ 
		System.out.println("username field is enabled"); 
		} 
		else 
		{ 
		System.out.println("username field is disabled"); 
		} 
		//pwd 
		if(status1) 
		{ 
		System.out.println("password field is enabled"); 
		} 
		else 
		{ 
		System.out.println("password field is disabled");
		}
	}

}
