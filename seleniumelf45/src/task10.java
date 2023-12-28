import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class task10 {
	public static void main(String[] args)throws InterruptedException {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String parentwindow= "https://retail.onlinesbi.sbi/retail/login.htm#";
		driver.get(parentwindow);
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("CONTINUE TO LOGIN")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Forgot Username / Login Password")).click();
		
		Thread.sleep(2000);
		Set<String> windowid =driver.getWindowHandles();
		for (String sbi : windowid) {
			String sb12=driver.switchTo().window(sbi).getCurrentUrl();
			System.out.println(sb12);
			if(!sb12.contains(parentwindow))
			{
				driver.switchTo().window(sbi).getCurrentUrl();
				driver.manage().window().maximize();
		driver.findElement(By.id("nextStep")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("userName")).sendKeys("RohithHN");
		driver.findElement(By.id("accountNo")).sendKeys("1313265979");
		driver.findElement(By.id("selCountry")).click();
		//driver.findElement(By.partialLinkText("India")).click();
		driver.findElement(By.id("mobileNo")).sendKeys("7338003747");
		driver.findElement(By.id("datepicker5")).sendKeys("19/04/2000");
		Thread.sleep(10000);
		driver.findElement(By.id("go")).click();
		}
	}
}
}
