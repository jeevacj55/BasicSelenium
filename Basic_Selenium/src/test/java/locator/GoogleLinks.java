package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleLinks {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/webhp?authuser=1");	
		
		List<WebElement> ref = driver.findElements(By.tagName("a"));
		int s = ref.size();
		System.out.println("Total number of links on the page: " + s);
		
		for (int i = 0; i < ref.size(); i++)
		{
            WebElement ele = ref.get(i);
            String str = ele.getText();
           
            System.out.println(str);
        }
	}
	}

