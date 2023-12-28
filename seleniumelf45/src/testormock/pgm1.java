package testormock;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pgm1 {
	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	String parentwindow= "https://retail.onlinesbi.sbi/retail/login.htm";
	driver.get(parentwindow);
	driver.findElement(By.partialLinkText("CONTINUE TO LOGIN")).click();
	driver.findElement(By.partialLinkText("Forgot Username / Login Password")).click();
	Set<String> windowid =driver.getWindowHandles();
	for (String sbi : windowid) {
		
		driver.getCurrentUrl();
		if(!sbi.contains(parentwindow))
		{
			driver.switchTo().window(sbi);
		}
}
	Dimension Size=driver.manage().window().getSize();
	int height = Size.getHeight();
	int width=Size.getWidth();

	Dimension targetsize=new Dimension((width+100),(height+100));
	
	driver.findElement(By.id("nextStep")).click();
	
	
	
	WebElement username = driver.findElement(By.id("userName"));
	username.clear();
	username.sendKeys("");
	driver.findElement(By.id("go")).click();
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.dismiss();
	username.clear();
	username.sendKeys("RohithHN");
	
	
	
	WebElement ACC = driver.findElement(By.id("accountNo"));
	driver.findElement(By.id("go")).click();
	System.out.println(alert.getText());
	alert.dismiss();
	ACC.sendKeys("12345678978");
	
	
	
	driver.findElement(By.id("go")).click();
	System.out.println(alert.getText());
	alert.dismiss();
	
	
	
	WebElement country=driver.findElement(By.id("selCountry"));
	Select drop=new Select(country);
	country.click();
	drop.selectByIndex(1);
	
	
	
	
	WebElement mobile=driver.findElement(By.id("mobileNo"));
	mobile.sendKeys("0");
	driver.findElement(By.id("go")).click();
	System.out.println(alert.getText());
	alert.dismiss();
	mobile.clear();
	mobile.sendKeys("7338003747");
	
	
	
	WebElement date=driver.findElement(By.id("datepicker5"));
	date.sendKeys("2000/19/04");
	driver.findElement(By.id("go")).click();
	System.out.println(alert.getText());
	alert.dismiss();
	date.clear();
	date.sendKeys("19/04/2000");
	
	
	
	driver.findElement(By.id("go")).click();
	System.out.println(alert.getText());
	alert.dismiss();

	}
}
