package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTagname_Attribute_Text {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver(); 
		driver.get("file:///C:/Users/jegat/Desktop/HTML%20files/getText_getAttribute_gettagName.html"); 
		//identify element 
		WebElement ele = driver.findElement(By.id("L1")); 
		//element tagname 
		String tag = ele.getTagName(); 
		System.out.println(tag); 
		
		//element attribute 
		String attr = ele.getAttribute("class"); 
		System.out.println(attr); 

		//element text
		String text = ele.getText(); 
		System.out.println(text); 

	}

}
