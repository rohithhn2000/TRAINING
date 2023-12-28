package Tasks;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class task3 {
	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ROHITH/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(3000);
		Set<String> allWindowsId=driver.getWindowHandles();
		for(String windowID : allWindowsId) {
			driver.switchTo().window(windowID);
			System.out.println(driver.getTitle());
		Dimension size=driver.manage().window().getSize();
		System.out.println("The height of page: "+ size.getHeight() );
		System.out.println("The width of the page:"+size.getWidth());
		Dimension targetsize= new Dimension(600,600);
		driver.manage().window().setSize(targetsize);
		Point targetposition=new Point(300,300);
		driver.manage().window().setPosition(targetposition);
		}
		Set<String> allWindowsId1=driver.getWindowHandles();
		for(String windowID : allWindowsId1) {
			driver.switchTo().window(windowID);
			if
			(driver.getCurrentUrl().contains("campco")) {
				
				driver.close();
				break;
				
		}
			
}
	}
}
