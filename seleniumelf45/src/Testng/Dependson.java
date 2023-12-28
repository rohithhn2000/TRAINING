package Testng;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependson {
	
		@Test(priority=0, invocationCount=2, threadPoolSize=2)
		public void infinix() {
			ChromeDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			driver.get("https://www.infinixmobility.com/");
			Reporter.log("infinix", true);
			driver.quit();
			
		}

	
			@Test(priority=1, invocationCount=2)
			public void Hp() {
				ChromeDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
				driver.get("https://www.hp.com/");
				Reporter.log("hp", true);
				driver.quit();
				
			}
			
				@Test( priority = 5)
				public void Dell() {
					ChromeDriver driver= new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
					driver.get("https://www.Dell.com/");
					Reporter.log("Dell", true);
					driver.quit();
					
				}
					@Test(priority=2, invocationCount=2)
					public void Lenovo() {
						ChromeDriver driver= new ChromeDriver();
						driver.manage().window().maximize();
						driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
						driver.get("https://www.Lenovo.com/");
						Reporter.log("Lenovo", true);
						driver.quit();
						
					}				}

