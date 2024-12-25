package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCss_GetRect {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/"); 
		WebElement ele = driver.findElement(By.xpath("//img[@title='Flipkart']")); 
		//below code for css value 
		String css = ele.getCssValue("font-size"); 
		System.out.println(css); 
		String css1 = ele.getCssValue("font-family"); 
		System.out.println(css1); 
		//below code for getsize 
		int width = ele.getSize().getWidth(); 
		int height = ele.getSize().getHeight(); 
		System.out.println(width); 
		System.out.println(height); 
		//below code for getlocation 
		int x = ele.getLocation().getX(); 
		int y=ele.getLocation().getY(); 
		System.out.println(x); 
		System.out.println(y); 
		//below code for GetRect() 
		Rectangle rect = ele.getRect(); 
		System.out.println(rect.getHeight()); 
		System.out.println(rect.getWidth());

	}

}
