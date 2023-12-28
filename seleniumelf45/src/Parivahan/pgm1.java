package Parivahan;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class pgm1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		Actions action=new Actions(driver);
		driver.get("https://parivahan.gov.in/parivahan/");
		List<WebElement> navbars = driver.findElements(By.xpath("//li[@data-type='menu_item' and @data-level='1']"));
		for (WebElement webElement : navbars) {
			action.keyDown(Keys.CONTROL).perform();
			webElement.click();
			action.keyUp(Keys.CONTROL).perform();
			
		}
		Set<String> windowids = driver.getWindowHandles();
		for (String string : windowids) {
			driver.switchTo().window(string);
			String title = driver.getTitle();
			if(title.contains("Site")) {
				driver.close();
				break;
			}
			else if(title.contains("Contact")) {
				driver.close();
				break;
			}
			
		}
		driver.quit();
		
		
		
}
}