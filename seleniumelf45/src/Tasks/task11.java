package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.chrome.ChromeDriver;

public class task11 {
	public static void main(String[] args)throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Register")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.id("FirstName")).sendKeys("Rohith");
	driver.findElement(By.id("LastName")).sendKeys("HNRO");
	driver.findElement(By.id("Email")).sendKeys("rohithhnFe412000@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Rohith@123");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("Rohith@123");
	driver.findElement(By.id("register-button")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.linkText("Log in")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("Email")).sendKeys("rohithhnFel2000@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Rohith@123");
	driver.findElement(By.id("RememberMe")).click();
	driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
	driver.findElement(By.partialLinkText("Books")).click();
	driver.findElement(By.cssSelector("input[class=\"button-2 product-box-add-to-cart-button\"]")).click();
	driver.findElement(By.linkText("Shopping cart")).click();
	driver.findElement(By.name("removefromcart")).click();
	driver.findElement(By.name("updatecart")).click();
	
		}
	
}


