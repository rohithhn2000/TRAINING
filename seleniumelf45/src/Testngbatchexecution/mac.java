package Testngbatchexecution;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class mac {
	@Test(timeOut = 35000, groups="Smoke")
	public void test() {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
driver.get("https://www.apple.com/in");
Reporter.log("Hai",true);
		driver.quit();
		

	}
}
