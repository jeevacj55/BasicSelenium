package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbsoluteXpath2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/jegat/Desktop/HTML%20files/AbsoluteXpath2.html");
		//first name
		driver.findElement(By.xpath("/html/body/div[1]/input[1]")).sendKeys("jeeva");
		//middle name
		driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("ganesh");
		//last name
		driver.findElement(By.xpath("/html/body/div[1]/input[3]")).sendKeys("c");
		//password
		driver.findElement(By.xpath("/html/body/div[2]/input[1]")).sendKeys("jeeva123");
		//Email
		driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("jeeva@gmail.com");
		Thread.sleep(5000);
		//Link1
		driver.findElement(By.xpath("/html/body/div[2]/a[1]")).click();
		Thread.sleep(5000);
		//navigate to mainpage
		driver.navigate().back();
		//Link2
		driver.findElement(By.xpath("/html/body/div[3]/a[1]")).click();
		//Thread.sleep(5000);
		//contact
		driver.findElement(By.xpath("/html/body/div[3]/input[1]")).sendKeys("8778075571");
		
	}

}
