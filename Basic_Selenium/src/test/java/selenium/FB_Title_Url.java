package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

//WATS to display title of a webpage

public class FB_Title_Url {

	public static void main(String[] args) 
	{
		 FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			//title
			String str = driver.getTitle();
			System.out.println("Title is "+str);
			//Current URL
			String str1 = driver.getCurrentUrl();
			System.out.println("Current URL is "+str1);
			driver.close();



	}

}
