package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.LoginUserWithValidEmailPassword;

public class LoginUserWithValidEmailPasswordTest extends BaseTest {
	
	 LoginUserWithValidEmailPassword obj;
	
  @Parameters({"validEmail","validPassword"})
  @Test
  public void loginValidEmailPassword(String validEmail,String validPassword) {
	  
	  obj = new  LoginUserWithValidEmailPassword(driver);
	  obj.validUserPassword(validEmail, validPassword);
  }
}
