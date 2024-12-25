package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Login
{
	@FindBy(id="email")
	 private WebElement email;
	@FindBy(id="pass")
	private WebElement pwd;
	@FindBy(xpath="//button[contains(@id,'u_0_5')]")
	private WebElement login;
	
	public Fb_Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login(String user, String pass)
	{
		email.sendKeys(user);
		pwd.sendKeys(pass);
		
		login.click();
	}
}
