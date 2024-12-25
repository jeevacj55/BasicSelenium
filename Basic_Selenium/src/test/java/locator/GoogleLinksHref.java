package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleLinksHref {

    public static void main(String[] args) 
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/webhp?authuser=1");   
        List<WebElement> links = driver.findElements(By.tagName("a"));
        int s = links.size();
        System.out.println("Total number of links on the page: " + s);

            for (int i = 0; i < links.size(); i++) {
                WebElement ele = links.get(i);
                String str = ele.getAttribute("href");
                
                System.out.println(str);
            }
        } 
    }

