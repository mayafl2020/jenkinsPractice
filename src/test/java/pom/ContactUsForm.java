package pom;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;


public class ContactUsForm {
	
	private WebDriver driver;
	
	@CacheLookup
	@FindBy(xpath=("//a[@href='/contact_us']"))
	WebElement contactUsBtn;
	
	@CacheLookup
	@FindBy(xpath = ("//h2[contains(text(),'Get In Touch')]"))
	WebElement getInTouch;
	
	@CacheLookup
	@FindBy(name ="name")
	WebElement userName;
	
	@CacheLookup
	@FindBy(name = "email")
	WebElement userEmail;
	
	@CacheLookup
	@FindBy(name ="subject")
	WebElement textSubject;
	
	@CacheLookup
	@FindBy(id="message")
	WebElement textMessage;
	
	@CacheLookup
	@FindBy(xpath = ("//input[@name ='upload_file']"))
	WebElement chooseFile;
	
	@CacheLookup
	@FindBy(name ="submit")
	WebElement submitBtn;
	
	
	@CacheLookup
	@FindBy(xpath = ("//h2[contains(text(),'Success! Your details have been submitted successfully.'])"))
	WebElement sText;
	
	@CacheLookup
	@FindBy(xpath =("//span[contains(text(),'Home')]"))
	WebElement homeBtn;
	
	
	
	public ContactUsForm(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void contactUs(String nameUser,String emailUser, String subject,String message) {
		
		contactUsBtn.click();
		Reporter.log("Get in touch is visible " + getInTouch.isDisplayed());
		userName.sendKeys(nameUser);
		userEmail.sendKeys(emailUser);
		textSubject.sendKeys(subject);
		textMessage.sendKeys(message);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", chooseFile);
		
//		Reporter.log("text is " + chooseFile.getText());
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
//		wait.until(ExpectedConditions.visibilityOf(chooseFile));
//		chooseFile.click();
		
		submitBtn.click();
		driver.switchTo().alert().accept();
		homeBtn.click();
		
//		js.executeScript("arguments[0].scrollIntoView()", homeBtn);
		
//		Reporter.log("Success! text = " + sText.getText() + " is visible " + sText.isDisplayed());
		
		
	}

}
