package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	
	@FindBy(xpath = "//a[text() = 'Log out']")
	WebElement logOutButton;
	
	@FindBy(id = "username")
	WebElement inputUserName;
	
	@FindBy(id = "password")
	WebElement inputPassword;
	
	@FindBy(id = "submit")
	WebElement submitButton;
	
	@FindBy(xpath = "//a[text() = 'Practice']")
	WebElement practicePage;
	
	@FindBy(xpath = "//a[text()='Test Login Page']")
	WebElement loginPage;
	
	@FindBy(xpath = "//h1")
	WebElement loginMsg;
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void enterLoginPage() {
		practicePage.click();
		loginPage.click();
	}
	
	public void enterUsername(String username) {
		inputUserName.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		inputPassword.sendKeys(password);
	}
	
	public void clickSubmit() {
		submitButton.click();
	}
	
	public void verifyLogin() {
		Assert.assertEquals(loginMsg.getText(), "Logged In Successfully", "Login Sucessfull Page");
	}
	
	public void verifyLogOut() {
		logOutButton.isDisplayed();
	}
	
	public void clickLogOut() {
		logOutButton.click();
	}

}
