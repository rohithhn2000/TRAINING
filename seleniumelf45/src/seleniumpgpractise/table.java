package seleniumpgpractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class table {
	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100000));
	driver.get("https://www.goodreturns.in/gold-rates/bangalore.html");
	List<WebElement> rows = driver.findElements(By.xpath("//h2[contains(text(),'Today 18 Carat ')]/../../div/table/tbody/tr[contains(@class,'row')]/td[1]"));
	List<WebElement> coloums =  driver.findElements(By.xpath("//h2[contains(text(),'Today 18 Carat ')]/../../div/table/tbody/tr[contains(@class,'row')]/td[2]"));
	
	for (WebElement webElement : rows) {
		System.out.print(webElement.getText()+ "=");
		
	}
	for (WebElement webElement : coloums) {
		System.out.println(webElement.getText());
		
	}
		
	}
	}

