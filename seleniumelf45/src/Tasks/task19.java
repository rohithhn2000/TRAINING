package Tasks;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task19 {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.get("https://groww.in/gold-rates/gold-rate-today-in-bangalore");
		 WebElement table=driver.findElement(By.xpath("(//table[@class='tb10Table'])[1]"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		for (WebElement gold: rows) {
			System.out.print(gold.getText());
			
		}
		System.out.println();
	}
}
