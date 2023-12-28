package workingwithActions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Trello {
	public static void main(String[] args) {
		ChromeDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofMinutes(2));
		driver.get("https://trello.com/en/login");
		WebElement login=driver.findElement(By.xpath("//input[@id='user']"));
		login.sendKeys("rohithhn2000@gmail.com");
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("login-submit")));
		driver.findElement(By.id("password")).sendKeys("Trello@Hello");
		driver.findElement(By.xpath("//button[@id='login-submit']")).click();
		driver.findElement(By.xpath("//div[@class='board-tile-details is-badged']")).click();
		WebElement card=driver.findElement(By.xpath("//a[@href='/c/ilLFBUz6/1-ft']"));		
		Actions action = new Actions(driver);
		action.contextClick(card).perform();
		List<WebElement> options = driver.findElements(By.xpath("//div[@data-testid='quick-card-editor-buttons']"));
		for (WebElement ref : options) {
			System.out.println(ref.getText());
			driver.navigate().refresh();
			WebElement source = driver.findElement(By.linkText("FT"));
			WebElement dest=driver.findElement(By.xpath("//h2[text()='API']/../../../..//button[@data-testid='list-add-card-button']"));
			action.dragAndDrop(source, dest).perform();
			
		}
//		
		
	}

}
