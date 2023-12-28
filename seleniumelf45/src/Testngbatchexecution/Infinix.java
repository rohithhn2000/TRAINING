package Testngbatchexecution;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Infinix {
	@Test(priority=0, invocationCount=2, threadPoolSize=2)
	public void infinix() {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.get("https://www.infinixmobility.com/");
		Reporter.log("infinix", true);
		driver.quit();
		
	}
}
