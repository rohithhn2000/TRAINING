package workingwithActions;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class onepage {
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
			Actions action=new Actions(driver);
			driver.get("https://onepagelove.com/");
			
			for(;;) {
				try {
					driver.findElement(By.linkText("Akermus")).click();
					
					driver.quit();
					break;
				} catch (NoSuchElementException E) {
					action.scrollByAmount(0, 1000).perform();
					
					
				}catch (ElementNotInteractableException e) {
					action.scrollByAmount(0, 100).perform();
					
				}
			}
	}

}
