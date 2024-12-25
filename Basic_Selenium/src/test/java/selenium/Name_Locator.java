package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Name_Locator {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/jegat/Desktop/HTML%20files/name_Locator.html");
		driver.findElement(By.id("name")).sendKeys("jeeva");
		driver.findElement(By.className("last")).sendKeys("ganesh");
		driver.findElement(By.name("mailid")).sendKeys("jeeva@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("jeeva123");
		driver.findElement(By.name("password")).sendKeys("jeeva456");
		driver.findElement(By.id("mobile")).sendKeys("8778075571");
		Thread.sleep(4000);
		//driver.close();
	}

}
