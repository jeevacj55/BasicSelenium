//verify frstname field is empty or not.
package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbFirstNameField 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        
        WebElement ele=driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
        ele.click();
        Thread.sleep(4000);
         WebElement ele1 = driver.findElement(By.xpath("//input[@name='firstname']"));
        Thread.sleep(4000);
        ele1.sendKeys("jeeva");

	}

}
