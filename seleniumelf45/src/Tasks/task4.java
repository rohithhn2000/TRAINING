package Tasks;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class task4 {
		public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ROHITH/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(3000);
		Set<String> allWindowsId1=driver.getWindowHandles();
		for(String windowID : allWindowsId1) {
			driver.switchTo().window(windowID);

	if (driver.getCurrentUrl().contains("cadbury"))
		{
		driver.close();
		}
		
}

}
}
