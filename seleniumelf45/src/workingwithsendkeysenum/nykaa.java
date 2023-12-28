package workingwithsendkeysenum;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class nykaa {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.nykaafashion.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@placeholder,\"Search\")]")).sendKeys("paints"," brush",Keys.ENTER);
		
}
}
