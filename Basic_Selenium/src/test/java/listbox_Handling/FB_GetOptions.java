package listbox_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_GetOptions {

	public static void main(String[] args)
	{
		// WATS to display total no. of option present in listbox as an output in FB year field
		WebDriver driver= new FirefoxDriver(); 
		driver.get("https://www.facebook.com/"); 
		driver.findElement(By.linkText("Create new account")).click(); 
		WebElement ele = driver.findElement(By.xpath("//select[@id='year']"));

		Select s = new Select(ele);
		List<WebElement> list = s.getOptions();
		int count = list.size(); 
		System.out.println("Listbox Size= "+count); 
	}

}
