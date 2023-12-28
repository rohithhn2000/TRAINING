package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumpackage.workingwithfindelement;
import working_with_searchcontext.wokingwithfindelement;

public class task16 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/user/login/");
		Thread.sleep(2000);	
		driver.findElement(By.linkText("Sign Up")).click(); 
		boolean no=driver.findElement(By.id("usertype_no")).isSelected();
		System.out.println("no radio is selected= "+no);
		if(no) {
		Boolean textbox=driver.findElement(By.id("groupcode")).isDisplayed();
		
		if(textbox) {
		System.out.println("It should not be displayed but displaying");
		}
		
		}
		WebElement	yes=driver.findElement(By.id("usertype_yes"));
		yes.click();
		boolean Yass=yes.isSelected();
		
		if(Yass) {
			Boolean textbox=driver.findElement(By.id("groupcode")).isDisplayed();
		if(textbox) {
			System.out.println("It is as per requirement");
		}
		
	}
		
	}
}
