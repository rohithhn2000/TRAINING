package seleniumpgpractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class espn {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100000));
		driver.get("https://www.espncricinfo.com/series/abu-dhabi-t10-2023-24-1410670/delhi-bulls-vs-new-york-strikers-18th-match-1410688/full-scorecard");
		WebElement table = driver.findElement(By.xpath("//span[text()='New York Strikers']/../../../..//table"));
		List<WebElement> player=driver.findElements(By.xpath(("(//span[text()= '(10 ovs maximum)']/../../../..//table[contains(@class,'ci-scorecard-table')]/tbody/tr[@class='']//div//a")));
		for (WebElement string : player) {
			
		
		System.out.print(string.getText());
		
		
	}
		

}		
	}
