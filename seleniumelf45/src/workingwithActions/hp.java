package workingwithActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hp {
	public static void main(String[] args) {
		ChromeDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		driver.get("https://www.hp.com/in-en/home.html");
		driver.findElement(By.xpath("//button[@id='onetrust-reject-all-handler']")).click();
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//span[text()='Explore']"))).perform();
		actions.contextClick(driver.findElement(By.xpath("//span[text()='Shop']"))).perform();
		
	}

}
