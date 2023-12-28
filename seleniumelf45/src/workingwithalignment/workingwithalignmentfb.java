package workingwithalignment;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithalignmentfb {
	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	String url="https://facebook.com/";
	driver.get(url);
	WebElement username=driver.findElement(By.id("email"));
	WebElement pass=driver.findElement(By.id("passContainer"));	
	org.openqa.selenium.Point email=username.getLocation();
	org.openqa.selenium.Point password=pass.getLocation();
	Dimension eemmail=username.getSize();
	Dimension passwrd=pass.getSize();
	System.out.println(eemmail.getWidth());
	System.out.println(passwrd.getWidth());
	System.out.println(email.getX());
	System.out.println(password.getX());
	if(email.getX()+eemmail.getWidth()==password.getX()+passwrd.getWidth()) {
		System.out.println("Alligned properly t");
	}
	else {
		System.out.println("Not Aligned");
	}
	
	
	

}
}
