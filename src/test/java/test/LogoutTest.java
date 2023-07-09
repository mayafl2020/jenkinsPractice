package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.Logout;

public class LogoutTest extends BaseTest {
	
	Logout logout;
	
  @Parameters({"validEmail","validPassword"})
  @Test
  public void logoutUser(String validEmail, String validPassword) {
	  
	  logout = new Logout(driver);
	  logout.userLogout(validEmail, validPassword);
	  
  }
}
