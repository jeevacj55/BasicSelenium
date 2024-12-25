package dynamicElementsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonRealtime {

	public static void main(String[] args) throws InterruptedException {
		
		
		
			WebDriver driver = new FirefoxDriver();
	        driver.get("https://www.amazon.com/");
	        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 14 128 gb midnight");       
	       Thread.sleep(5000);
	       
	       driver.findElement(By.xpath("//input[@type='submit']")).click();
	      // WebElement ele = driver.findElement("By.xpath")
	      /* WebElement ele = driver.findElement(By.xpath("//div[@class='KzDlHZ']/..//span[contains(text(),'Ratings')]"));
	       String str = ele.getText();
	       System.out.println(str);
	      
	     //for reviews
	       //WebElement ele2 = driver.findElement(By.xpath("//div[@class='KzDlHZ']/..//span[contains(text(),'Ratings')]/following-sibling::span/following-sibling::span"));
	       WebElement ele2 = driver.findElement(By.xpath("//div[@class='KzDlHZ']/..//span[contains(text(),'Ratings')]/..//span[contains(text(),'Reviews')]"));
	       String str2 = ele2.getText();
	       System.out.println(str2);
	       driver.close();*/
		}

	}


