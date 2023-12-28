package seleniumpgpractise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class pgm22 {
@Parameters("br")
@Test	(priority = 2, invocationCount = 2, threadPoolSize = 2)
public void google( String browser) {
	WebDriver driver=null;
	if(browser.equalsIgnoreCase("Chrome")) {
		driver=new ChromeDriver();
		
	}
	else if(browser.equalsIgnoreCase("Firefox")) {
		driver=new FirefoxDriver();
	}
	else {
		Reporter.log("Invalid browser", true);
	}
	//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	driver.get("https://google.com");
	driver.quit();
	
}
	

}
