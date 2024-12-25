package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttribute_RealTime {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		//email 
		WebElement ele = driver.findElement(By.id("email")); 
		ele.sendKeys("abc@gmail.com"); 
		//Attribute(Entered text("abc@gmail.com") 
		String str = ele.getAttribute("value"); 
		System.out.println(str);

	}

}
