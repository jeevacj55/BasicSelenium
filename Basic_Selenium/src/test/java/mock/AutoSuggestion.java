package mock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.amazon.com/"); 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("blutooth mouse");
		
        Thread.sleep(3000); 

        
        List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']/..//span[contains(text(),'wireless bluetooth mouse')]"));


        for (int i = 0; i < suggestions.size(); i++) {
            if (suggestions.get(i).getText().toLowerCase().contains("bluetooth mouse")) {
                suggestions.get(i).click();
                break; 
            }
        }


	}

}
