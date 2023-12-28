package working_with_searchcontext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wokingwithfindelement {
	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(1000);
		WebElement emailtextbox= driver.findElement(By.id("Email"));
		emailtextbox.sendKeys("rohithhn2000@gmail.com");
		Thread.sleep(1000);
		WebElement password=driver.findElement(By.id("Password"));
		password.sendKeys("Password@123");
		Thread.sleep(1000);
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.className("button-1 login-button")).click();
	}

}
