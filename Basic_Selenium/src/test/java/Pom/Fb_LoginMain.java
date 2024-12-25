package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fb_LoginMain {

	public static void main(String[] args)
	{
	
		{
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			Fb_Login  rv = new Fb_Login(driver);
			rv.login("jeeva@gmail.com","jeeva123");
			driver.close();

		}
	}

}
