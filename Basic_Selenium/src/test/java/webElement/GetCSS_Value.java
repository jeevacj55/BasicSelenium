package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCSS_Value {

	public static void main(String[] args)
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		String str = ele.getCssValue("email");
		System.out.println(str);
	}

}
