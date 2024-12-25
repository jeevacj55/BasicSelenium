package listbox_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver(); 
		driver.get("file:///C:/Users/jegat/Desktop/HTML%20files/LIST%20BOX.html"); 
		//listbox 
		WebElement ele = driver.findElement(By.id("listbox")); 
		Select s = new Select(ele); 
		boolean b = s.isMultiple(); 
		if(b) 
		{ 
		System.out.println("Listbox is multiselectable"); 
		} 
		else 
		{ 
		System.out.println("Listbox is not multiselectable"); 
		}

	}

}
