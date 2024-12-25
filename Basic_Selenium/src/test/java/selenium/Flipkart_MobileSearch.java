package selenium;
//WATS to search for mobiles in flipkart Application.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart_MobileSearch
{

	public static void main(String[] args) throws InterruptedException 
	{
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://www.flipkart.com/");
		  driver.findElement(By.name("q")).sendKeys("mobiles");
		  Thread.sleep(4000);
		  driver.findElement(By.className("_2iLD__")).click();
		  
	}

}
