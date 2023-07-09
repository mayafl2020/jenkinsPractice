package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class InvalidEmailPassword {
	
	private WebDriver driver;
	
	@CacheLookup
	@FindBy (xpath = ("//a[@href='/login']"))
	WebElement login;
	
	@CacheLookup
	@FindBy(xpath = ("//input[@data-qa ='login-email']"))
	WebElement email;
	
	@CacheLookup
	@FindBy(name = "password")
	WebElement password;
	
	@CacheLookup
	@FindBy(xpath = ("//button[@data-qa='login-button']"))
	WebElement loginBtn;
	
	@CacheLookup
	@FindBy(xpath = ("//p[contains(text(),'Your email or password is incorrect!')]"))
	WebElement errorMessage;
	
	
	
	public InvalidEmailPassword(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginInvalidInfo(String invalidEmail,String invalidPassword) {
		
		login.click();
		email.sendKeys(invalidEmail);
		password.sendKeys(invalidPassword);
		loginBtn.click();
		Reporter.log("Your email or password is incorrect! is displayed " + errorMessage.isDisplayed());
		
		
	}

}
