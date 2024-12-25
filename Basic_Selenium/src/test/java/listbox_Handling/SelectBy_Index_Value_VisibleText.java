package listbox_Handling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectBy_Index_Value_VisibleText {

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		WebDriver driver= new FirefoxDriver(); 
		driver.get("https://www.facebook.com/"); 
		driver.findElement(By.linkText("Create new account")).click(); 
		//Approach 1 
		Thread.sleep(6000); 
		driver.findElement(By.id("day")).click(); 
		driver.findElement(By.xpath("//option[text()='22']")).click(); //using index
		//Approach 2 
		WebElement month = driver.findElement(By.id("month")); 
		month.click(); 
		month.sendKeys("Nov"); 
		/*Robot r = new Robot(); 
		r.keyPress(KeyEvent.VK_UP); 
		r.keyPress(KeyEvent.VK_UP); 
		r.keyPress(KeyEvent.VK_ENTER); */
		//Approach 3 
		WebElement year = driver.findElement(By.id("year")); 
		Select s = new Select(year); 
		//s.selectByIndex(7); //using index
		Thread.sleep(3000); 
		//s.selectByValue("2006"); //using value
		Thread.sleep(3000); 
		s.selectByVisibleText("1998");//using visible text

	}

}
