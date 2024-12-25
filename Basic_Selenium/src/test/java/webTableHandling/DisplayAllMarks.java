package webTableHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DisplayAllMarks {

	public static void main(String[] args) {
		//  WATS to display all the marks in webtable as an output
		
		WebDriver driver = new FirefoxDriver(); 
		driver.get("file:///C:/Users/jegat/Desktop/HTML%20files/HandlingWebTables.html"); 
		List<WebElement> list = driver.findElements(By.xpath("//td[3]")); 
		int s = list.size(); 
		System.out.println("Total no. of marks column ="+s); 
		for(int i=0;i<s;i++) 
		{ 
		WebElement ele = list.get(i); 
		String str = ele.getText(); 
		System.out.println(str);
		}
	}

}
