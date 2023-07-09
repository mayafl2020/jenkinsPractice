package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.DeleteAccount;

public class DeleteAccountTest extends BaseTest {

	DeleteAccount obj;

	@Parameters({ "userEmail", "userPassword" })
	@Test
	public void deleteUser(String userEmail, String userPassword) {

		obj = new DeleteAccount(driver);
		obj.deleteUserAccount(userEmail,userPassword);
	}
}
