package seleniumpgpractise;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pagesource {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebDriverWait Explicit=new WebDriverWait(driver, Duration.ofMillis(15000));
		driver.get("https://www.goodreturns.in/gold-rates/bangalore.html");
//		File file=new File("Practis.HTML");
//		if(!file.exists()){
//			file.createNewFile();
//			System.out.println("File is created");
//		}
//		else {
//			System.out.println("File is not ctreated");
//		}
//		FileOutputStream fos=new FileOutputStream(file);
//		fos.write(driver.getPageSource().getBytes());
		//Explicit.until(ExpectedConditions.visibilityOfElementLocatedBy.id("google_ads_iframe_/1008496/money-728x90_0"));
	Thread.sleep(10000);
		WebElement add = driver.findElement(By.xpath("//div[contains(@style,'eft: 0px; width: 265px; position: fixed; cursor: pointer; background-repeat: no-repeat; z-index: 9999; top: 0px; height: 376px')]"));
		//driver.switchTo().frame(add);
		Thread.sleep(10000);
			File source = add.getScreenshotAs(OutputType.FILE);
	File file1=new File("./Screenshots/practise.png");
	FileHandler.copy(source, file1);
	
	driver.switchTo().defaultContent();
	
	
	}

}
