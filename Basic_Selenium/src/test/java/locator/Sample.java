package locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");

			driver.findElement(By.linkText("Forgotten password?")).click();
			driver.findElement(By.cssSelector("input[type='text']")).sendKeys("abc@gmailcom");
	}

}
