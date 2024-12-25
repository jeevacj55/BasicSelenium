package testNG;

import org.testng.annotations.Test;

public class Script_5 {
	@Test 
	public void Contact() 
	{ 
	System.out.println("Contact Added"); 
	} 
	@Test(dependsOnMethods="Contact") 
	public void Chat() 
	{ 
	System.out.println("Chat");
	}
}
