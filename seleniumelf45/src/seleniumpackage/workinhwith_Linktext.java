package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class workinhwith_Linktext {
	public static void main(String[] args) throws InterruptedException {
		
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.woodenstreet.com/?gad_source=1&gclid=CjwKCAiAvJarBhA1EiwAGgZl0FRo7hKQYi-I0hNqNqhgQXk5d8Bh8wZ4fRRHJpTZzm3kwVX6BD4RKhoCYWIQAvD_BwE");
	Thread.sleep(5000);
	driver.findElement(By.linkText("Dining & Kitchen")).click();
	Thread.sleep(5000);
	driver.findElement(By.partialLinkText("Modular Kitchen")).click();
	driver.quit();
	

}
}