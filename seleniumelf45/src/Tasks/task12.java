package Tasks;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class task12 {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.webdriver", "./Drivers/chromedrivers.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		String parent="https://www.maybelline.co.in/?utm_source=google&utm_medium=cpc&utm_campaign=&utm_content=&utm_term=maybelline&gad_source=1&gclid=CjwKCAiAvJarBhA1EiwAGgZl0EzwB6aKSSA-8R-xWiZgicK0chBzajn1v_X2jjCr72r18qG-pKrp8BoCD1MQAvD_BwE";
		String parentid=driver.getWindowHandle();
		driver.get(parent);
		driver.switchTo().newWindow(WindowType.TAB);
		String url2="https://www.nykaafashion.com/";
		driver.get(url2);
			Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Men")).click();
		Thread.sleep(3000);
		
		Set<String> allWindowsId=driver.getWindowHandles();
		for (String window : allWindowsId) {
		if(driver.switchTo().window(window).getTitle().contains("Men"))
		{
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Careers")).click();
			break;
		}
		
		}
		driver.switchTo().window(parentid).close();
		}


}
