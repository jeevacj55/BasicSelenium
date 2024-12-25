package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Total_Images_In_Amazon {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.amazon.com/"); 
		List<WebElement> ref = driver.findElements(By.xpath("//img")); 
		int s = ref.size(); 
		System.out.println("Total no. of images "+s); 

	}

}
