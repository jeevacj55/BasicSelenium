package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//WATS to select images in flipkart app. 
public class XpathByIndex_Locator {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(5000);
	driver.findElement(By.name("q")).sendKeys("iphone");
	driver.findElement(By.className("_2iLD__")).click();
	Thread.sleep(5000);
	// To identify First image 
	driver.findElement(By.xpath("(//img[@class='DByuf4'])[1]")).click();
	Thread.sleep(5000);
	
	//To identify Last Image 
	//driver.findElement(By.xpath("(//img[@class='_2puWtW _3a3qyb'])[last()]")).click();
	//Thread.sleep(5000);
	
	// To identify second last image
	//driver.findElement(By.xpath("(//img[@class='_2puWtW _3a3qyb'])[last()-1]")).click();
	
	//To identify first 3 image 
	//driver.findElement(By.xpath("(//img[@class='_2puWtW _3a3qyb'])[position()<=3]")).click();
	
	 
	

	}

}
