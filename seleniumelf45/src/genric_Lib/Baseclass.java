package genric_Lib;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;

public class Baseclass {
public WebDriver driver;	

	@BeforeClass

	public void launch(@Optional("chrome") String browsername) {
		
		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else {
			Reporter.log("Invalid browser", true);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.get("https://demowebshop.tricentis.com/");
		
	}

	
		
	

	@AfterMethod
	public void logout() {
		driver.findElement(By.linkText("Log out")).click();

	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
