package seleniumpgpractise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class pgm {
@Parameters ("br")
@Test	
public void test(@Optional ("Chrome") String browser) {
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
