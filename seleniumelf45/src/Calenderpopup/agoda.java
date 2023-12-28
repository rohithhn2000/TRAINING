package Calenderpopup;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class agoda {public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	WebDriverWait Explicit=new WebDriverWait(driver, Duration.ofMillis(8000));
	driver.manage().window().maximize();
	LocalDateTime ldt = LocalDateTime.now();
	//System.out.println(ldt);
	String month=ldt.getMonth().name();
	String monthname=month.substring(0, 1).toUpperCase()+month.substring(1).toLowerCase();
	int year=ldt.getYear();
	int day = ldt.getDayOfMonth();
	driver.get("https://www.agoda.com/en-in/?ds=Ez%2FieemXuVnE6fHs");
//	Explicit.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='No thanks']"))).click();	
	driver.findElement(By.id("check-in-box")).click();
//	for(;;){
//		try {
//			driver.findElement(By.xpath("//div[text()='December 2023']/..//span[text()='8']")).click();
//			driver.findElement(By.xpath("//div[text()='December 2023']/..//span[text()='9']")).click();
//		} catch (NoSuchElementException e) {
//			driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
//		}
//		for END DATE
//	}
	for(;;){
		try {
			driver.findElement(By.xpath("//div[text()='"+monthname+" "+(year+1)+"']/..//span[text()='"+(day-2)+"']")).click();
			driver.findElement(By.xpath("//div[text()='"+monthname+" "+(year+1)+"']/..//span[text()='"+(day-1)+"']")).click();
			break;
		} catch (NoSuchElementException e) {
			driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
		}
		
	}
	
	
	
	}
}