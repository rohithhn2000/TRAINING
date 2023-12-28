package Dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data2darray {
	@DataProvider(parallel = true)
	public String[][] Demo(){
	String[] [] arr= {
			{"Roh@123", "Roh@123"},
			{"Sum@123", "SUma@123"},
			{"hp@123", "Hp@123"}
	};
	return arr;
	}
	@Test(dataProvider = "Demo", dataProviderClass = Dataprovider.data2darray.class)
	public void demoscript(String []arr) throws InterruptedException{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(arr[0]);
		driver.findElement(By.id("Password")).sendKeys(arr[1]);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
