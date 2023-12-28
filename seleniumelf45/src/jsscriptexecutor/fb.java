package jsscriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fb {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebDriverWait Explicit=new WebDriverWait(driver, Duration.ofMillis(2000));
		//Explicit.
		driver.get("https://www.facebook.com/signup");
		WebElement hidden=driver.findElement(By.name("custom_gender"));
		driver.executeScript("arguments[0].value='Data entered';",hidden);
	}

}
