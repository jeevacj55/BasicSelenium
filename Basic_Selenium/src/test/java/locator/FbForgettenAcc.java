//ques:WATS display tagname, attribute and text of forgetten account in fb
package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbForgettenAcc {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        
         WebElement ele = driver.findElement(By.xpath("//a[contains(text(), 'Forgotten password?')]"));
	
        String tag = ele.getTagName();
	}

}
