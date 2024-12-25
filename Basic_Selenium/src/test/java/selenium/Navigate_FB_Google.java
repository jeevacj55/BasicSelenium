package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

/*Ques: WATS to perform foll. actions:
1: Open Firefox 
2: OPen Facebook app.
3: Open google app.
4: Navigate to facebook app.
5: Navigate to google app.
6: close the browser*/

public class Navigate_FB_Google {

	public static void main(String[] args)
	{
		/* FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			driver.get("https://www.google.com/");
			driver.get("https://www.facebook.com/");
			driver.get("https://www.google.com/");
			driver.close();*/
		
//by using navigate method
		 FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			driver.navigate().to("https://www.google.com/");
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh();
			driver.close();


	}

}
