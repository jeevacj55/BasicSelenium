package selenium;
//WATS to click on forgotten pwd in facebook
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Forgetten_PasswordLink {

	public static void main(String[] args) throws InterruptedException
	{
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.facebook.com/");
		 
		 driver.findElement(By.partialLinkText("Forgotten password?")).click();
		 Thread.sleep(5000);
		 driver.close();
	}

}
