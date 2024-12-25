package listbox_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_DateMultiSelectable {

	public static void main(String[] args)
	{
		WebDriver driver= new FirefoxDriver(); 
		driver.get("https://www.facebook.com/"); 
		driver.findElement(By.linkText("Create new account")).click(); 
		WebElement ele = driver.findElement(By.xpath("//select[@id='day']"));
		Select s= new Select(ele);
		 boolean b = s.isMultiple();
		 if(b)
		 {
			 System.out.println("multi selectable");
		 }
		 else
		 {
			 System.out.println("not multi selectable");
		 }
		

	}

}
