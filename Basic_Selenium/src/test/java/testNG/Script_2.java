package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script_2 {
@Test
public void createAccount()
{
	Reporter.log("Create Account", true);
}

@Test
public void EditAccount()
{
   Reporter.log("Edit Account", true);	
}

@Test
public void DeleteAccount()
{
   Reporter.log("Delete Account", true);	
}

}
