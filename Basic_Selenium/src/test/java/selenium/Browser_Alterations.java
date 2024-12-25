package selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class Browser_Alterations {

    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new FirefoxDriver();
        
      
            driver.get("https://www.google.com/");
            Thread.sleep(5000);

            driver.navigate().to("https://www.facebook.com/");
            Thread.sleep(5000);

            driver.navigate().back();
            Thread.sleep(5000);

            driver.navigate().forward();
            Thread.sleep(5000);

            driver.navigate().refresh();
            Thread.sleep(5000);

            Dimension d = new Dimension(300, 500);
            driver.manage().window().setSize(d);
            Thread.sleep(5000);

            Point p = new Point(180, 300);
            driver.manage().window().setPosition(p);
            Thread.sleep(5000);

            driver.manage().window().maximize();
            Thread.sleep(5000);

            driver.manage().window().fullscreen();
            Thread.sleep(5000);

        
            driver.manage().window().minimize();
            Thread.sleep(5000);

            driver.close();
        }
    }

