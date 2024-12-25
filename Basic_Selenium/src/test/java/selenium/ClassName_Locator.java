package selenium;
//WATS to enter Firstname,LastName,Email and pwd in below webpage
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassName_Locator
{

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/jegat/Desktop/HTML%20files/ClassName_Locator.html");
		/*//Firstname
		By fn = By.id("name");
		WebElement ele = driver.findElement(fn);
		ele.sendKeys("admin");
		//Lastname
		By ln = By.className("last");
		WebElement ele1 = driver.findElement(ln);
		ele1.sendKeys("xyz");
		//Email
		By email = By.id("email");
		WebElement ele2 = driver.findElement(email);
		ele2.sendKeys("abc@gmail.com");
		//pwd
		By pass = By.id("pwd");
		WebElement ele3 = driver.findElement(pass);
		ele3.sendKeys("klop");*/
		
		//First name
		driver.findElement(By.id("name")).sendKeys("jeeva");
		
        //Last name
		driver.findElement(By.className("last")).sendKeys("ganesh");
		
		//Email
		driver.findElement(By.id("email")).sendKeys("jeeva@gmail.com");
		
		//password
		driver.findElement(By.className("pass")).sendKeys("jeeva1234");
		
		
	}

}
