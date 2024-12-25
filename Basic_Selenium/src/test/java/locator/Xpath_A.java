package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_A {

    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();

       {
            driver.get("https://www.facebook.com/");
            driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jeevacj55@gmail.com");
            
            driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Deadpool@20");
            driver.findElement(By.xpath("//button[contains(@id,'u_0_5')]")).click();
     
       
        }
    }
}
