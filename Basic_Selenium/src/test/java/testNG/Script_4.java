package testNG;

import org.testng.annotations.Test;

public class Script_4 {

	@Test(invocationCount=5) 
	public void CreateAccount() 
	{ 
	System.out.println("Create Account"); 
	}
}
