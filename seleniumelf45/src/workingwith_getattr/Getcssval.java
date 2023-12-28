package workingwith_getattr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcssval {

	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
	Thread.sleep(2000);
//	driver.findElement(By.partialLinkText("SPANISH")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.partialLinkText("ENGLISH")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.partialLinkText("SIGN IN")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.id("email")).sendKeys("rohithhn200@@@gmail.com");
//	driver.findElement(By.xpath("//button[contains(text(), 'Submit')]")).click();
//	
//	WebElement error=driver.findElement(By.xpath("//label[@id='email-error']"));
//	
//	System.out.println(error.getCssValue("color"));
//	System.out.println(error.getCssValue("display"));
//	System.out.println(error.getCssValue("font-size"));
	WebElement logo=driver.findElement(By.xpath("//img[@alt= 'SkillRary']"));
	System.out.println(logo.getCssValue("vertical-align"));
	System.out.println(logo.getCssValue("display"));
	System.out.println(logo.getCssValue("color"));
		
	}
}