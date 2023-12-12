package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	private static WebDriver driver;
	
	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://practicetestautomation.com/");
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	@After
	public void closeSetUp() {
		if(driver != null) {
			driver.quit();
		}
	}
}
