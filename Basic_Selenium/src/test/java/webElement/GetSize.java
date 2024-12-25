package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetSize {

	public static void main(String[] args)
	{
	   // WATS to identify height and width of UN field
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
        Dimension d = ele.getSize();
      int height = d.getHeight();
       int width = d.getWidth();
       
       System.out.println("username height is "+height);
       System.out.println("username width is "+width);
       driver.close();
	}

}
