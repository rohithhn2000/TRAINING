package notificationpopuptab;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Easemytrip {
	public static void main(String[] args) throws InterruptedException, AWTException {
//		ChromeDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	//	WebDriverWait Explicit=new WebDriverWait(driver, Duration.ofMinutes(2));
	//	driver.get("https://www.easemytrip.com/");
//		Robot robot=new Robot();
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(2000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(2000);
		
	
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(2000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		Thread.sleep(2000);
//		robot.keyPress(KeyEvent.VK_ENTER);
	//==================================================================================
		//handling the notification
	ChromeOptions settings=new ChromeOptions();
	//settings.addArguments("--incognito");
	settings.addArguments("--disable-notifications");
	ChromeDriver driver=new ChromeDriver(settings);
	driver.get( "https://easemytrip.com/");
	
	
	 
	//Firefox options
//	FirefoxOptions options=new FirefoxOptions();;
//	options.setCapability("dom.webnotifications.enabled", true);

	
	
	
	

//	
	
	}
}