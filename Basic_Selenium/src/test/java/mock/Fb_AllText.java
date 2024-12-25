package mock;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb_AllText {

    public static void main(String[] args) throws InterruptedException {
       
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
        Thread.sleep(4000); 
        
        WebElement ele = driver.findElement(By.id("month"));
        Select selectMonth = new Select(ele);

        List<WebElement> options = selectMonth.getOptions();
        List<String> monthNames = new ArrayList<>();


        for (int i = 0; i < options.size(); i++) {
            monthNames.add(options.get(i).getText());
        }

       
        for (int i = 0; i < monthNames.size() - 1; i++) {
            for (int j = 0; j < monthNames.size() - 1 - i; j++) {
                if (monthNames.get(j).compareTo(monthNames.get(j + 1)) > 0) {
                    
                    String s = monthNames.get(j);
                    monthNames.set(j, monthNames.get(j + 1));
                    monthNames.set(j + 1, s);
                }
            }
        }

      
        for (int i = 0; i < monthNames.size(); i++) {
            System.out.println(monthNames.get(i));
        }


        driver.quit();
    }
}



