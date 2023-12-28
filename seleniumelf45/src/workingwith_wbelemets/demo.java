package workingwith_wbelemets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String[] args)throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Log in")).click();
	Thread.sleep(2000);
	WebElement Emailele=driver.findElement(By.id("Email"));
	Emailele.clear();
	Emailele.sendKeys("rohith@@@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Rohith@123");
	driver.findElement(By.cssSelector("input[value='Log in']")).submit();
	String error=driver.findElement(By.cssSelector("span[for='Email']")).getText();
	System.out.println(error);
	}
}
