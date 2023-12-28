package workingwithsendkeysenum;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String[] args) throws InterruptedException {		
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Log in")).click();
	Thread.sleep(2000);
	WebElement Emailele=driver.findElement(By.id("Email"));
	Emailele.clear();
	Emailele.sendKeys("Rohithhn@gmail.com",Keys.CONTROL+"a"+"c");
	}
}