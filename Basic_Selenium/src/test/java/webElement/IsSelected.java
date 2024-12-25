package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsSelected {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver(); 
        driver.get("https://www.facebook.com/"); 
        driver.findElement(By.xpath("//a[text()='Create new account']")).click(); 
        driver.manage().window().maximize(); 
        Thread.sleep(4000); 

       // WebElement female = driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")); 
        WebElement male = driver.findElement(By.xpath("//input[@value='2']"));
        male.click();
       boolean b1 = male.isSelected();
       if(b1) {
    	   System.out.println("male option radio button is selected");
       }else {
    	   System.out.println("male option radio button is not selected");
       }

    /*    // Action 1 
        female.click(); 
        boolean b1 = female.isSelected(); 
        if (b1) { 
            System.out.println("Female option Radio button is selected"); 
        } else { 
            System.out.println("Female option Radio button is not selected"); 
        } 

        // Action 2 
        male.click(); 
        boolean b2 = male.isSelected(); 
        boolean b3 = female.isSelected(); 

        if (b2) { 
            System.out.println("Male option Radio button is selected"); 
        } else { 
            System.out.println("Male option Radio button is not selected"); 
        } 

        if (b3) { 
            System.out.println("Female option Radio button is selected"); 
        } else { 
            System.out.println("Female option Radio button is not selected"); 
        }

       // driver.quit(); // Close the browser*/
    }
}
