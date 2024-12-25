package practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.className("_1Us3XD")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.className("I-qZ4M vLRlQb")).sendKeys("8778075571");

	}

}
