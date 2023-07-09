import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class basic {

	WebDriver driver;

	public void createAccount() {
//
//		System.setProperty("webdriver.chrome.driver",
//				"/Users/mayafarberov/eclipse-workspace/automation/drivers/chromedriver");
//		driver = new ChromeDriver();
//
//		driver.navigate().to("https://www.automationexercise.com");
//		System.out.println("Page title is " + driver.getTitle());
//		System.out.println("Page url is " + driver.getCurrentUrl());
//		System.out.println(
//				"Login button is displayed " + driver.findElement(By.xpath("//a[@href='/login']")).isDisplayed());
//		driver.findElement(By.xpath("//a[@href='/login']")).click();
//		System.out.println("New User Signup! is visible "
//				+ driver.findElement(By.xpath("//h2[contains(text(),'!')]")).isDisplayed());
//		driver.findElement(By.name("name")).sendKeys("Maya");
//		driver.findElement(By.xpath("//input[@data-qa ='signup-email']")).sendKeys("miaqapro@gmail.com");
//		driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
//		System.out.println("Enter account information! is visible "
//				+ driver.findElement(By.xpath("//b[contains(text(),'Enter')]")).isDisplayed());
//		driver.findElement(By.xpath("//input[@value='Mrs']")).click();
//		driver.findElement(By.id("password")).sendKeys("test123");
//		Select days = new Select(driver.findElement(By.name("days")));
//		days.selectByValue("16");
//		Select months = new Select(driver.findElement(By.name("months")));
//		months.selectByIndex(6);
//		Select year = new Select(driver.findElement(By.name("years")));
//		year.selectByValue("1986");
//		driver.findElement(By.name("newsletter")).click();
//		driver.findElement(By.name("optin")).click();
//		driver.findElement(By.name("first_name")).sendKeys("Maya");
//		driver.findElement(By.name("last_name")).sendKeys("Far");
//		driver.findElement(By.name("company")).sendKeys("QAPro");
//		driver.findElement(By.name("address1")).sendKeys("1441 military trail ");
//		Select country = new Select(driver.findElement(By.name("country")));
//		country.selectByValue("United States");
//		driver.findElement(By.name("state")).sendKeys("FL");
		driver.findElement(By.name("city")).sendKeys("Boca Raton");
//		driver.findElement(By.xpath("//input[@data-qa='zipcode']")).sendKeys("330990");
//		driver.findElement(By.name("mobile_number")).sendKeys("999999");
		driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
//		driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click();

	}

	public void deleteAccount() {
//
//		System.setProperty("webdriver.chrome.driver",
//				"/Users/mayafarberov/eclipse-workspace/automation/drivers/chromedriver");
//		driver = new ChromeDriver();

		driver.navigate().to("https://www.automationexercise.com");
		System.out.println("Page title is " + driver.getTitle());
		System.out.println("Page url is " + driver.getCurrentUrl());
		System.out.println(
				"Login button is displayed " + driver.findElement(By.xpath("//a[@href='/login']")).isDisplayed());
		driver.findElement(By.xpath("//a[@href='/login']")).click();

		driver.findElement(By.name("email")).sendKeys("miaqapro@gmail.com");
		driver.findElement(By.name("password")).sendKeys("test123");
		driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
		driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
//		driver.findElement(By.id("dismiss-button")).click();
//		driver.findElement(By.xpath("a[@data-qa='continue-button']")).click();
//		driver.quit();
	}

	public static void main(String[] args) {

		basic obj = new basic();
//         obj.createAccount();
		 obj.deleteAccount();

	}

}
