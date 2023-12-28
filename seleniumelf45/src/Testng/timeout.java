package Testng;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeout {
	@Test(timeOut = 35000)
	public void test() {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.get("https://Audi.com");
		Reporter.log("Hai",true);
		driver.quit();
		

	}
}
