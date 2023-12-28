package workingwith_getattr;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwith_alt {
	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://skillrary.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.partialLinkText("SPANISH")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.partialLinkText("ENGLISH")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.partialLinkText("SIGN IN")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("email")).sendKeys("rohithhn2000@gmail.com");
//		Thread.sleep(1000);
//		String email=driver.findElement(By.id("email")).getAttribute("name");
//		System.out.println(email);
		
		
		driver.get("https://www.woodenstreet.com/");
		String rec=driver.findElement(By.xpath("//img[contains(@title, 'Recliners')]")).getAttribute("logo");
		System.out.println(rec);
		
		
		//driver.get("https://www.kalkifashion.com/");
		
	}

}