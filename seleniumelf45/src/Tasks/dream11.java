package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dream11 {
	public static void main(String[] args) throws  InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		driver.get("https://www.dream11.com/");
		driver.switchTo().frame(0);
		WebElement mobile=driver.findElement(By.xpath("////input[@id='regEmail']"));
		mobile.click();
		mobile.sendKeys("73338003745");
}
}