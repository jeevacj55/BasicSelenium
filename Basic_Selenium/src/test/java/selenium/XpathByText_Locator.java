package selenium;
// WATS to display webpage component Text as an output
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByText_Locator {

	public static void main(String[] args) throws InterruptedException
	{
		 WebDriver driver = new FirefoxDriver();
		 driver.get("file:///C:/Users/jegat/Desktop/HTML%20files/XpathByText_Locator.html");
		 
		String str = driver.findElement(By.xpath("//span[text()='Text Msg1']")).getText();
        System.out.println(str);
        Thread.sleep(5000);
        String str1 = driver.findElement(By.xpath("//a[text()='Link 1']")).getText();
        System.out.println(str1);
        Thread.sleep(5000);
        driver.close();
	}

}
