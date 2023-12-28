package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task14 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.webdriver", "./Drivers.chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url="https://demo.vtiger.com/vtigercrm/";
		driver.get(url);
		WebElement username=driver.findElement(By.id("username"));
		username.clear();
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.id("password"));
		password.clear();
		driver.findElement(By.xpath("//Button[text()='Sign in']")).submit();;
		WebElement Login=driver.findElement(By.id("validationMessage"));
		String text=Login.getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement username1=driver.findElement(By.id("username"));
		username1.clear();
		WebElement pass1=driver.findElement(By.id("password"));
		pass1.clear();
		username1.sendKeys("Rohith");
		pass1.sendKeys("Vtiger@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//Button[text()='Sign in']")).submit();
		//Login.getText();		
		String mess=driver.findElement(By.xpath("//span[contains(@id,'validationMessage')]")).getText();
		System.out.println(mess);
		
		
		}
}


