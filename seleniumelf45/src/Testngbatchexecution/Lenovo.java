package Testngbatchexecution;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Lenovo {
	@Test(priority=2, invocationCount=2, groups={"Sanity", "Smoke"})
	public void Lenovo() {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.get("https://www.Lenovo.com/");
		Reporter.log("Lenovo", true);
		driver.quit();
	}
}
