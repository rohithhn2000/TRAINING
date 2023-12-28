package seleniumpgpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tillwebele {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.passportindia.gov.in/AppOnlineProject/welcomeLink");
		Thread.sleep(2000);	
		driver.findElement(By.linkText("X")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Registration')]")).click();
		Thread.sleep(2000);
		boolean pass=driver.findElement(By.xpath("//input[@value='PO']")).isSelected();
		System.out.println(pass);
	WebElement register=driver.findElement(By.id("frmSample_register"));
	
		System.out.println(register.isEnabled());
		System.out.println(register.getCssValue("color"));
		System.out.println(register.getCssValue("cursor"));
	}
}
