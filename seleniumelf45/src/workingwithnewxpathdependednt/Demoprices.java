package workingwithnewxpathdependednt;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoprices {
	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Log in")).click();
	WebElement Emailele=driver.findElement(By.id("Email"));
	Emailele.clear();
	Emailele.sendKeys("Rohithhn20@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Demo@123");
	driver.findElement(By.cssSelector("input[value='Log in']")).submit();
	driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Rockabilly')]/../..//input[@value='Add to cart']")).click();
	driver.findElement(By.xpath("//input[@id='add-to-cart-button-5']")).click();
	driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Blue and')]/../..//input[@value='Add to cart']")).click();
	driver.findElement(By.xpath("//input[@id='add-to-cart-button-28']")).click();
	driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
	driver.findElement(By.linkText("Casual Golf Belt")).click();
	driver.findElement(By.xpath("//input[@id='add-to-cart-button-40']")).click();
	driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	String price1=driver.findElement(By.xpath("//table[@class= 'cart']/tbody/tr[1]/td[4]/span[2]")).getText();
	String price2=driver.findElement(By.xpath("//table[@class= 'cart']/tbody/tr[2]/td[4]/span[2]")).getText();
	String price3=driver.findElement(By.xpath("//table[@class= 'cart']/tbody/tr[3]/td[4]/span[2]")).getText();	
	double p1=Double.parseDouble(price1);
	double p2=Double.parseDouble(price2);
	double p3=Double.parseDouble(price3);
	double res=(p1<p2)?((p1<p3)?p1:p3):((p2<p3)?p2:p3);
	
	if(res==p1) {
		driver.findElement(By.xpath("//table[@class= 'cart']/tbody/tr[1]//input[@type='checkbox']"));
		
	}
	}
	
	}

