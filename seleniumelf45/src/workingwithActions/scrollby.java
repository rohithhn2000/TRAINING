package workingwithActions;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class scrollby {
	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
			Actions action=new Actions(driver);
			driver.get("https://www.naukri.com/");
//			action.scrollToElement(driver.findElement(By.xpath("//span[text()='Resume writing']"))).perform();
//			action.scrollByAmount(0, 2990).perform();
			WebElement ele=driver.findElement(By.xpath("//span[text()='Resume writing']"));
//			ele.click();
			ScrollOrigin scrl=ScrollOrigin.fromElement(ele);
			action.scrollFromOrigin(scrl, 0, 200).perform();
	}

}
