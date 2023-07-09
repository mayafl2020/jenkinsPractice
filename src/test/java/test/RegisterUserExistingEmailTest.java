package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.RegisterUserExistingEmail;

public class RegisterUserExistingEmailTest extends BaseTest{
	
	RegisterUserExistingEmail obj;
	
  @Parameters({"userName","userEmail"})
  @Test
  public void registerExistinEmail(String userName,String userEmail) {
	  
	  obj = new RegisterUserExistingEmail(driver);
	  obj.registerExistingEmail(userName, userEmail);
	  
  }
}
