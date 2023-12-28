package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class task9 {
	public static void main(String[] args)throws InterruptedException {
		
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://skillrary.com/");
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("SPANISH")).click();
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("ENGLISH")).click();
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("SIGN IN")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("rohithhn2000@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Rohithhn2000@");
	Thread.sleep(10000);
	driver.findElement(By.id("usertype_yes")).click();
	driver.findElement(By.id("groupcode")).sendKeys("TYSS123");
	Thread.sleep(2000);
	driver.findElement(By.name("remember")).click();
	Thread.sleep(2000);
	driver.quit();
	
	}
}
