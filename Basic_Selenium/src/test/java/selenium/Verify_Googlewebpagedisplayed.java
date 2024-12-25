package selenium;
// WATS to verify Google webpage is displayed or not

import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Googlewebpagedisplayed {

	public static void main(String[] args) 
	{
		  ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			String str = driver.getTitle();
			if(str.equalsIgnoreCase("google"))
			{
				System.out.println("Google webpage displayed");
			}
			else
			{
				System.out.println("Google page not displayed");
			}
			driver.close();


	}

}
