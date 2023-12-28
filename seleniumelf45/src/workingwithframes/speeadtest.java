package workingwithframes;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class speeadtest {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		driver.get("https://www.speedtest.net/");
		WebElement add=driver.findElement(By.xpath("//iframe[@data-google-container-id='5']"));
		driver.switchTo().frame(add);
		driver.findElement(By.id("cbb")).click();
		driver.switchTo().parentFrame();
		
	}

}

