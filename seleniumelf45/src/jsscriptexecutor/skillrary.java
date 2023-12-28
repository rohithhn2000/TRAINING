package jsscriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class skillrary {
	public static void main(String[] args) {
	
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofMinutes(2));
	WebElement disablebox=driver.findElement(By.xpath("//input[@class='form-control']"));
	driver.executeScript("arguments[0].value='Hi';",disablebox);
	
}
}
