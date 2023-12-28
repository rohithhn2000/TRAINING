package workingwithnewxpathdependednt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kalki {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.get("https://www.kalkifashion.com/in/");
		driver.findElement(By.linkText("Men")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Kurta Jacket Set')]")).click();
		driver.findElement(By.xpath("(//img[@title='Pink Jacket And Kurta Set With Floral Motif Thread Work'])[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Off White Floral')]/../../../..//button[@id='buy-now']")).click();
		
		
	}
}
//