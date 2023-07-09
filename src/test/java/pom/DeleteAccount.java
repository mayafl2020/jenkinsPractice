package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DeleteAccount {
	
	private WebDriver driver;

	@CacheLookup
	@FindBy (xpath = ("//a[@href='/login']"))
	WebElement login;
	
	@CacheLookup
	@FindBy(xpath = ("//input[@data-qa ='login-email']"))
	WebElement email;
	
	@CacheLookup
	@FindBy(xpath = ("//button[@data-qa='login-button']"))
	WebElement loginBtn;
	
	@CacheLookup
	@FindBy(name = "password")
	WebElement password;
	
	@CacheLookup
	@FindBy(xpath = ("//a[@href='/delete_account']"))
	WebElement deleteBtn;
	
	@CacheLookup
	@FindBy(xpath = ("//b[contains(text(),'Account Deleted!')]"))
	WebElement deleteAccount;
	
	public DeleteAccount(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void deleteUserAccount(String userEmail,String userPassword) {
		
		login.click();
		email.sendKeys(userEmail);
		password.sendKeys(userPassword);
		loginBtn.click();
		deleteBtn.click();
		Reporter.log("Account Deleted is visible  " + deleteAccount.isDisplayed());
		
		
		
	}
}
