package locator;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB_Excel {

    public static void main(String[] args) throws EncryptedDocumentException, IOException
    {
       
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
            FileInputStream fis = new FileInputStream("..C:\\Users\\jegat\\Desktop Fb Credentials.xlsx");
            Workbook book = WorkbookFactory.create(fis);
            
            Row row = book.getSheet("Sheet1").getRow(1);
            String un = row.getCell(0).toString();
            String pwd = row.getCell(1).toString();
            
            driver.findElement(By.id("email")).sendKeys(un);
            driver.findElement(By.name("pass")).sendKeys(pwd);
            driver.findElement(By.name("login")).click();
            
    }}
    

