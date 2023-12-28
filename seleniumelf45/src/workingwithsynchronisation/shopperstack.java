package workingwithsynchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class shopperstack {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		WebDriverWait explicitwait=new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();
		WebElement email=driver.findElement(By.id("Email"));
		email.click();
		email.sendKeys("testyantra123@gmail.com");
		WebElement pass=driver.findElement(By.id("Password"));
		pass.click();By.id("Check Delivery");
		pass.sendKeys("Test@123");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		driver.findElement(By.xpath("//span[text()='LEVIS']")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("560010");
		WebElement checkButton=driver.findElement(By.id("Check"));
		explicitwait.until(ExpectedConditions.elementToBeClickable(By.id("Check Delivery")));
		checkButton.click();
	
		
		
			}
		

}

