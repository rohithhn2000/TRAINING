package working_with_enabled;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wokingisenabled {
	public static void main(String[] args)throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		String url="https://www.instagram.com/";
		driver.get(url);
		Thread.sleep(2000);
		Boolean Login=driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		System.out.println(Login);
		String tag=driver.findElement(By.xpath("//button[@type='submit']")).getTagName();
		System.out.println(tag);
		
	}

}
