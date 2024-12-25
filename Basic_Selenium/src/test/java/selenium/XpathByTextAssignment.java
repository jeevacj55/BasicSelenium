package selenium;
// WATS to display forgotten pwd text an an output? 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByTextAssignment {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	    WebElement ele	=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
        String str = ele.getText();
        System.out.println(str);
    
	}

}
