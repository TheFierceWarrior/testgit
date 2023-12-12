import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
public static void main(String[] args) throws InterruptedException {

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();

    driver.get("https://formy-project.herokuapp.com/switch-window");
    
   String currentWindow = driver.getWindowHandle();
   
   System.out.println(currentWindow);
   
   driver.findElement(By.xpath("//button[@id='new-tab-button']")).click();
   
   Set<String> windows = driver.getWindowHandles();
   
    for(String window: windows) {
    	System.out.println("Window "+window);
    	driver.switchTo().window(window);
    	Thread.sleep(3000);
    }
    
    driver.close();
}
}