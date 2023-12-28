package seleniumpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithswitchto {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("WebDriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ROHITH/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(3000);
		Set<String> allWindowsId=driver.getWindowHandles();
		for(String windowID : allWindowsId) {
			
			driver.switchTo().window(windowID);
			System.out.println(driver.getTitle());
			}
		}
	}