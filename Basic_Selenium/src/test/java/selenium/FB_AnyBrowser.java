package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB_AnyBrowser {

    WebDriver driver;

    public void browser(String browserName)
    {
        if (browserName.equalsIgnoreCase("Firefox")) 
        {
            driver = new FirefoxDriver();
        } 
        else if (browserName.equalsIgnoreCase("Chrome")) 
        {
            driver = new ChromeDriver();
        } 
        else
        {
            driver = new EdgeDriver();
        }

        driver.get("https://www.facebook.com/");
        driver.close();
    }

    public static void main(String[] args) 
    {
        FB_AnyBrowser rv = new FB_AnyBrowser();
        rv.browser("Firefox");
        rv.browser("Chrome");
        rv.browser("Edge");
    }
}
