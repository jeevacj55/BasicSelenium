package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TotalDisabledEnabledLinks_inGoogle {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.google.com/"); 
		List<WebElement> ref = driver.findElements(By.xpath("//a")); 
		int s = ref.size(); 
		System.out.println("Total No. Of Links "+s); 
		int enabled=0; 
		int disabled=0; 
		for(int i=0;i<ref.size();i++) 
		{ 
		WebElement ele = ref.get(i); 
		boolean b = ele.isEnabled(); 
		if(b) 
		{ 
		enabled++; 
		} 
		else 
		{ 
		disabled++; 
		} 
		} 
		System.out.println("No. Of Links Enabled "+enabled); 
		System.out.println("No. Of Links Disabled "+disabled);
		driver.close();

	}

}
