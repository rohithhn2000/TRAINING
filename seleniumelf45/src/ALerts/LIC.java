package ALerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LIC {
	public static void main(String[] args) throws InterruptedException {		
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://licindia.com/");
	WebElement add = driver.findElement(By.xpath("//button[text()='Close']"));
	add.click();
	driver.findElement(By.xpath("//span[contains(text(), ' Customer Portal ')]")).click();
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.dismiss();
	
	}
}
