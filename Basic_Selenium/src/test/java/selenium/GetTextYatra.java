package selenium;
//WATS to display text as an output in yatra.com
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTextYatra {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yatra.com/");
		
		WebElement ele = driver.findElement(By.className("main-heading"));
		String str = ele.getText();
		System.out.println(str);
		driver.close();


	}

}
