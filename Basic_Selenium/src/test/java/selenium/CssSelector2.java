package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector2 {

	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver = new FirefoxDriver();
         driver.get("file:///C:/Users/jegat/Desktop/HTML%20files/CssSelector2.html");
         /*driver.findElement(By.cssSelector("input[type='text']")).sendKeys("abcd");
 		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("manager");
 		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("dmnk");
 		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("abc@gmail.com");
 		driver.findElement(By.cssSelector("input[type='button']")).click();
 		
 		html code contains same attribute so we can't use cssSelector to identify those elements.

 		*/
         driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("jeeva");
 		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("jeeva123");
 		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("8778075571");
 		driver.findElement(By.xpath("/html/body/input[4]")).sendKeys("jeeva@gmail.com");
 		Thread.sleep(5000);
              
	}

}
