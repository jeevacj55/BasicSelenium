package listbox_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_CountryInFatcow {

	public static void main(String[] args) 
	{
		WebDriver driver= new FirefoxDriver(); 
		driver.get("http://www2.fatcow.com/"); 
		//select country 
		WebElement ele = driver.findElement(By.id("countrySelect")); 
		Select s = new Select(ele); 
		s.selectByVisibleText("Canada");

	}

}
