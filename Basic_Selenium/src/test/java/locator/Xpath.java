package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/jegat/Desktop/html%20files%20for%20selenium/table.html");
		driver.findElement(By.xpath("//td[text()='Selenium']"));
		
		driver.findElement(By.xpath("//td[text()='Selenium']/.."));
		
		driver.findElement(By.xpath("//td[text()='Selenium']/../td[3]"));

	}

}
