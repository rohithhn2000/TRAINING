package workingwithscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class pgm1 {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
//		driver.get("https://www.asianpaints.com/");
//		File f=driver.getScreenshotAs(OutputType.FILE);
//		File  saved=new File("./Screenshots/1.jpeg");
//		FileHandler.copy(f, saved);
		driver.get("https://www.asianpaints.com/");
		File ff=driver.findElement(By.xpath("//img[@title=\"asian-paint-logo\"]")).getScreenshotAs(OutputType.FILE);
		File  saved=new File("./Screenshots/2.png");
		FileHandler.copy(ff, saved);
		
	}
	
}