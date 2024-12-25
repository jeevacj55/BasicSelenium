package dynamicElementsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicRealtime {

	public static void main(String[] args) throws InterruptedException
	{
		// WATS to display redmi 9 activ coral green 128 gb Mobile rating as an output in flipkart
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.flipkart.com/");
        
       driver.findElement(By.xpath("//input[@type='text']")).sendKeys("redmi 9 active coral green 128gb");
       
       Thread.sleep(5000);
       //for ratings
       driver.findElement(By.xpath("//button[@type='submit']")).click();
       WebElement ele = driver.findElement(By.xpath("//div[@class='KzDlHZ']/..//span[contains(text(),'Ratings')]"));
       String str = ele.getText();
       System.out.println(str);
      
     //for reviews
       //WebElement ele2 = driver.findElement(By.xpath("//div[@class='KzDlHZ']/..//span[contains(text(),'Ratings')]/following-sibling::span/following-sibling::span"));
       WebElement ele2 = driver.findElement(By.xpath("//div[@class='KzDlHZ']/..//span[contains(text(),'Ratings')]/..//span[contains(text(),'Reviews')]"));
       String str2 = ele2.getText();
       System.out.println(str2);
       driver.close();
     
       
	}

}
