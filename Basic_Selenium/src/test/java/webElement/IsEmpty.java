package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsEmpty {

	public static void main(String[] args) throws InterruptedException
	{
		// WATS to verify Firstname field is empty or not after entering text in fb app
		
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.facebook.com/"); 
		driver.findElement(By.xpath("//a[text()='Create new account']")).click(); 
		Thread.sleep(4000); 
		WebElement ele = driver.findElement(By.name("firstname")); 
		ele.sendKeys("jeeva"); 
		String str = ele.getAttribute("value"); 
		System.out.println(str); 
		if(str.isEmpty()) 
		{ 
		System.out.println("Firstname field is empty"); 
		} 
		else 
		{ 
		System.out.println("Firstname field is not empty");
		}

	}

}
