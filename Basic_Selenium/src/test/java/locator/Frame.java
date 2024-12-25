package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
        WebElement frame = driver.findElement(By.xpath("//singleframe"));
        driver.switchTo().frame(frame);
        Thread.sleep(5000); 
        
    
        driver.findElement(By.id("text")).sendKeys("admin");

	}

}
