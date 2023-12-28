package workingwithdropdownsel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class manualfb {
	public static void main(String[] args) throws IOException, InterruptedException {
		//	System.setProperty("Webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
			driver.get("https://demoapp.skillrary.com/");
			WebElement dropdown=driver.findElement(By.id("cars"));
			Select multilist=new Select(dropdown);
			
			multilist.selectByIndex(0);
			Thread.sleep(1000);
			multilist.selectByValue("99");
			Thread.sleep(1000);
			multilist.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");
			Thread.sleep(1000);
			multilist.deselectByIndex(5);
			multilist.deselectByIndex(2);
			Thread.sleep(1000);
			multilist.deselectByValue("199");
			multilist.deselectAll();
			
			
			
	}

}


	