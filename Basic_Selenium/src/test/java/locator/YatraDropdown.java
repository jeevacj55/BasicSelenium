package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class YatraDropdown {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yatra.com/?utm_source=google&utm_medium=search&utm_campaign=brand&_gcl&utm_source=google&utm_medium=cpc&utm_campaign=&gad_source=1&gclid=CjwKCAjw0aS3BhA3EiwAKaD2ZfcgYE7R9Dkf2Qd6DU8q0HolMIgr_xsrEoDXn1XGFvlwC0CLezEPARoCuO8QAvD_BwE");
Actions a = new Actions(driver);
WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'more-arr')]"));
a.moveToElement(ele).perform();
Thread.sleep(5000);
driver.findElement(By.xpath("//a[text()='Trains'])")).click();
	}

}
