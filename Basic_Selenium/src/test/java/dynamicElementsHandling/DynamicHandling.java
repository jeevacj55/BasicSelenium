package dynamicElementsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		// WATS to print cost of selenium book as an output. 
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/jegat/Desktop/HTML%20files/RelativeXpath_Table.html");
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//td[text()='Selenium']")).getText();
		WebElement ele = driver.findElement(By.xpath("//td[text()='Selenium']/../td[3]"));
		String str = ele.getText();
        System.out.println(str);	
		
		driver.close();
	}

}
