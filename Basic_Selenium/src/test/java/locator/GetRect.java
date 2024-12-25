package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetRect {

    public static void main(String[] args) {
      
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");

        WebElement ele = driver.findElement(By.xpath("//input[@id='email']"));
        Rectangle rect = ele.getRect();
        int emailHeight = rect.getHeight();
        int emailWidth = rect.getWidth();
        System.out.println("Email Field - Height: " + emailHeight + ", Width: " + emailWidth);

        WebElement ele1 = driver.findElement(By.xpath("//input[@id='pass']"));
        Rectangle rect1 = ele1.getRect();
        int passwordHeight = rect1.getHeight();
        int passwordWidth = rect1.getWidth();
        System.out.println("Password Field - Height: " + passwordHeight + ", Width: " + passwordWidth);

        boolean d = (emailHeight == passwordHeight) && (emailWidth == passwordWidth);
        if (d)
        {
            System.out.println("The dimensions of email and password fields are same.");
        } 
        else {
            System.out.println("The dimensions of email and password fields are different.");
        }

       
    }
}
