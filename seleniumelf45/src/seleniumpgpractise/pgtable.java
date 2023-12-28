package seleniumpgpractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgtable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.get("https://www.moneycontrol.com/news/gold-rates-today/bangalore/");

			//List<WebElement> table = driver
					driver.findElements(By.xpath("h3[contains(text(),'Compare 22K')]/..//table/tbody/tr"));

		//	for (WebElement string : table) {

//				System.out.println(string.getText());
			}
}
	
