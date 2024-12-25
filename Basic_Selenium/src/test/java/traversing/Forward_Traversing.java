package traversing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Forward_Traversing {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/jegat/Desktop/HTML%20files/Traversing.html");
		Thread.sleep(4000);
		
		//absolute xpath method
		//driver.findElement(By.xpath("/html/body/div/input[1]")).sendKeys("jeeva");
		
		//relative xpath method
		//driver.findElement(By.xpath("//input[1]")).sendKeys("jeeva");
		
		//xpathByAttribute method
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jeeva");
		
		//xpathByText method
      //  driver.findElement(By.xpath("//input[text()='User']")).sendKeys("jeeva");
		
		// xpathBycontains method
		//driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("jeeva");
		
		//xpathByStartWith method
		driver.findElement(By.xpath("//input[starts-with(@type,'text')]")).sendKeys("jeeva");
		
	}

}
