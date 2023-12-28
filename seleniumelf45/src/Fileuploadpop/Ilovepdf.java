package Fileuploadpop;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ilovepdf {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver( );
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		WebDriverWait Explicit = new WebDriverWait(driver, Duration.ofMillis(2000));
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/");
		Actions action = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//span[text()='Convert PDF']"));
		action.moveToElement(ele).perform();
		WebElement pdf = driver.findElement(By.xpath("//span[text()='Convert PDF']/..//a[@href='/pdf_to_jpg']"));
		Explicit.until(ExpectedConditions.elementToBeClickable(pdf));
		pdf.click();
		WebElement accept = driver.findElement(By.xpath("//input[@accept='.pdf']"));
		accept.sendKeys("C:\\Users\\ROHITH\\Downloads\\Manual, API,Java.pdf");

	}
}