package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class task6_Skillrary {
	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/user/login/");
		Thread.sleep(10000);
		/*driver.findElement(By.className("dropdown-toggle ignorelink")).click();
		Thread.sleep(10000);
		driver.findElement(By.partialLinkText("ENGLISH")).click();*/
		driver.findElement(By.id("email")).sendKeys("rohtihhn1904@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Rohtihhn1904@");
		Thread.sleep(10000);
		driver.findElement(By.name("remember")).click();
		driver.findElement(By.name("btn btn-color animated fadeInLeft")).click();
		
			driver.quit();
	}

}
