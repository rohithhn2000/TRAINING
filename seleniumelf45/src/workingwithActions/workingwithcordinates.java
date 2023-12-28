package workingwithActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class workingwithcordinates {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("4Sas");
		Actions actions=new Actions(driver);
		Thread.sleep(2000);
		actions.moveToElement(pass, 283, 0).clickAndHold().perform();
		
	}
}
