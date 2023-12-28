package Tasks;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class foodpanda {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		Actions action=new Actions(driver);
		driver.get("https://www.foodpanda.com/");
		
		List<WebElement> clik = driver.findElements(By.xpath("//ul[@id='menu-primary']/li/a[contains(@href,'/')]"));
		for (WebElement webElement : clik) {
		action.keyDown(Keys.CONTROL).perform();
		webElement.click();
		action.keyUp(Keys.CONTROL).perform();
		}
		
		Set<String> windowid = driver.getWindowHandles();
		for (String window : windowid) {
			driver.switchTo().window(window);
			String title=driver.getTitle();
			System.out.println(title);
			if(title.contains("panda ads")) {
				driver.close();
			}
		}
		driver.switchTo().defaultContent();
		}
		
		

}
