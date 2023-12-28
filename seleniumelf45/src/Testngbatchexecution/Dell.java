package Testngbatchexecution;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dell {
	@Test( priority = 5,groups="Smoke")
	public void Dell() {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.get("https://www.Dell.com/");
		Reporter.log("Dell", true);
		driver.quit();
		
	}

	
}
