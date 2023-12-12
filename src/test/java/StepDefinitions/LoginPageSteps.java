package StepDefinitions;

import org.openqa.selenium.WebDriver;

import PageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {

	private WebDriver driver = DriverManager.getDriver();
	LoginPage loginPage = new LoginPage(driver);
	
	@Given("the user has launch the login page")
	public void the_user_has_launch_the_login_page() {
		loginPage.enterLoginPage();
	}
	
	@When("^the user enters the username as (.*)$")
	public void the_user_enters_the_username_as(String string) {
		loginPage.enterUsername(string);
	}
	
	@When("^the user enters the password as (.*)$")
	public void the_user_enters_the_password_as(String string) {
		loginPage.enterPassword(string);
	}
	
	@When("the user clicks on login button")
	public void the_user_clicks_on_login_button() throws InterruptedException {
		loginPage.clickSubmit();
		Thread.sleep(2000);
	}
	
	@Then("verify that user logged in successfully")
	public void login_Success() {
		loginPage.verifyLogin();
	}
	
	@Then("verify logout button is displayed")
	public void verify_logout_button_is_displayed() {
	   loginPage.verifyLogOut();
	}
	
	@When("the user click on logout button")
	public void the_user_click_on_logout_button() {
	   loginPage.clickLogOut();
	}	
	
}