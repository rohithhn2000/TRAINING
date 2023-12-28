package Testngbatchexecution;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class hp {
	@Test(priority=1, invocationCount=2, groups=" ")
	public void Hp() {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.get("https://www.hp.com/");
		Reporter.log("hp", true);
		driver.quit();
		
	

	}
}
