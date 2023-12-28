package seleniumpackage;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;


public class workingwithfindelement {
	public static void main(String[] args) throws InterruptedException {
	FirefoxDriver c=new FirefoxDriver();
	c.get("https://www.shoppersstack.com/products_page/4");
	Thread.sleep(10000);
	c.findElement(By.id("compare")).click();
	Thread.sleep(10000);
	c.quit();
	
  
}


}
