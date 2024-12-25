package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/jegat/Desktop/html%20files%20for%20selenium/student%20table.html");		
        
		 List<WebElement> rows = driver.findElements(By.xpath("//table[@id='studentTable']//tr"));
		 
		 int calculatedSum = 0;
         int displayedTotal = 0;

         // Iterate through the rows, skipping the header row
         for (int i = 1; i < rows.size() - 1; i++) { // Exclude the last row (total row)
             WebElement row = rows.get(i);
             WebElement marksCell = row.findElements(By.tagName("td")).get(2); // Marks are in the third column (index 2)
             int marks = Integer.parseInt(marksCell.getText().trim());
             calculatedSum += marks;
         }

         // Get the displayed total from the last row
         WebElement totalRow = rows.get(rows.size() - 1); // Last row is the total row
         WebElement totalCell = totalRow.findElements(By.tagName("td")).get(2); // Total is in the third column (index 2)
         displayedTotal = Integer.parseInt(totalCell.getText().trim());

         // Verify if the calculated sum matches the displayed total
         if (calculatedSum == displayedTotal) {
             System.out.println("Test Passed: The sum of marks matches the total displayed.");
         } else {
             System.out.println("Test Failed: The sum of marks does not match the total displayed.");
         }
	}
}
