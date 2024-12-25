package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetLocation {

	public static void main(String[] args)
	{
		// WATS to display X & Y Position of UN field
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		Point p = ele.getLocation();
		int x = p.getX();
		int y = p.getY();
		
		System.out.println("x position ="+x);
		System.out.println("y position ="+y);
		
		driver.close();
	}

}
