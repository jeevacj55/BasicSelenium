//find number of images in amazon app
package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonImages {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> ref = driver.findElements(By.tagName("img"));
		int i = ref.size();
        System.out.println("Total number of images:" + i);


	}

}
