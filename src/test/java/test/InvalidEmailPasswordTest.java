package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.InvalidEmailPassword;

public class InvalidEmailPasswordTest extends BaseTest{
	
	InvalidEmailPassword obj;

  @Parameters({"invalidEmail","invalidPassword"})
  @Test
  public void invalidCredentioals(String invalidEmail,String invalidPassword) {
	  
	  obj = new InvalidEmailPassword(driver);
	  obj.loginInvalidInfo(invalidEmail, invalidPassword);
  }
}
