package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v114.css.CSS;

public class workingwithcss {
	public static void main(String[] args)throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Log in")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("Email")).sendKeys("Rohith@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Rohith@12");
	driver.findElement(By.id("RememberMe")).click();
	driver.findElement(By.cssSelector("input[value=\"Log in\"]")).click();

		}
	
}
