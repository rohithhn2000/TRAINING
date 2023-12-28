package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class task17 {
	public static void main(String[] args) throws InterruptedException {		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.purplle.com/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("SHOP")).click();
		driver.findElement(By.xpath("//a[@data-evlbl=\"Makeup > Primer\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(), 'MARS Take a')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("SHOP")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-evlbl=\"Makeup > Primer\"]")).click();
		
		driver.findElement(By.id("367354")).click();
}}
