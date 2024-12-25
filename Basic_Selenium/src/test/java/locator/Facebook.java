package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        
        WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
        emailField.sendKeys("jeeva");

        emailField.sendKeys(Keys.CONTROL + "a"); 
        emailField.sendKeys(Keys.CONTROL + "c");

        WebElement passwordField = driver.findElement(By.xpath("//input[@id='pass']"));
        passwordField.click(); 
        passwordField.sendKeys(Keys.CONTROL + "v"); 
        
        // Optionally, you can also submit the form if needed
        // driver.findElement(By.xpath("//button[@name='login']")).click();
        
        // Close the browser (optional, uncomment if needed)
        // driver.quit();
    }
}

