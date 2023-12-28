package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {
	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(20000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Create Account")).click();
		WebElement Firstname=driver.findElement(By.id("First Name"));
		Firstname.sendKeys("Rohith");
		Thread.sleep(2000);
		WebElement Lastname=driver.findElement(By.id("Last Name"));
		Lastname.sendKeys("HNR");
		Thread.sleep(2000);
		driver.findElement(By.id("Male")).click();
		driver.findElement(By.id("Phone Number")).sendKeys("7338003747");
		driver.findElement(By.id("Email Address")).sendKeys("rohtihhn1904@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Rohtihhn1904@");
		driver.findElement(By.id("Confirm Password")).sendKeys("Rohtihhn1904@");
		driver.findElement(By.id("Terms and Conditions")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("btnDisabled")).click();
	}
}