package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTextElements {

	public static void main(String[] args) 
	{
		 WebDriver driver = new FirefoxDriver();
		 driver.get("file:///C:/Users/jegat/Desktop/HTML%20files/getText.html");
		 String str = driver.findElement(By.id("msg")).getText();
		 System.out.println(str);
		 String str1 = driver.findElement(By.name("link")).getText();
		 System.out.println(str1);
		 String str2 = driver.findElement(By.linkText("Link 2")).getText();
		 System.out.println(str2);
		 String str3 = driver.findElement(By.linkText("Text Msg2")).getText();
		 System.out.println(str3);

	}

}
