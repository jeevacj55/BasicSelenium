package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Id_Locator {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/jegat/Desktop/HTML%20files/id_Locator.html");
		/*//username
		By un = By.tagName("input");
		WebElement ele = driver.findElement(un);
		ele.sendKeys("admin");
		//password
		By pwd = By.id("pass");
		WebElement ele1 = driver.findElement(pwd);
		ele1.sendKeys("manager");
		//checkbox
		By chk = By.id("check");
		WebElement ele2 = driver.findElement(chk);
		ele2.click();*/
		
		//username
		driver.findElement(By.tagName("input")).sendKeys("admin");
		
		//password
		driver.findElement(By.id("pass")).sendKeys("manager");
		
		//checkbox
		driver.findElement(By.id("check")).click();
		


	}

}
