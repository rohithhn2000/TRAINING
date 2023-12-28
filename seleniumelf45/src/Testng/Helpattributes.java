package Testng;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Helpattributes {
	@Test(priority=2, invocationCount=2, threadPoolSize=2)
	public void test() {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.get("https://Audi.com/");
		Reporter.log("AUDII", true);
		driver.quit();
		
	}
	@Test(priority=2, invocationCount=2)
	public void test1() {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.get("https://Landrover.com/");
		driver.quit();
	}
	@Test(priority=1, invocationCount=5, threadPoolSize=4, enabled=false)
	public void test3() {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.get("https://BMW.com/");
		driver.quit();
		
	}	
	
}
