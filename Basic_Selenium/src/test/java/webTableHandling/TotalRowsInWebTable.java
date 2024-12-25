package webTableHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TotalRowsInWebTable {

	public static void main(String[] args) 
	{
		//  WATS to display total no. of rows as an output 

		WebDriver driver = new FirefoxDriver(); 
		driver.get("file:///C:/Users/jegat/Desktop/HTML%20files/HandlingWebTables.html"); 
		//all rows 
		List<WebElement> list = driver.findElements(By.xpath("//tr")); 
		int s = list.size(); 
		System.out.println("Total No. Of Rows "+s); 
	}

}
