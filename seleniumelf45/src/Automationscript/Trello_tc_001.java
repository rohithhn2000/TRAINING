package Automationscript;
/***
 * @author ROHITH
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Trello_tc_001 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		//reading data from excel
//		File abspath=new File("./resources/data.xls");
//		FileInputStream fis=new FileInputStream(abspath);
//		Workbook workbook=WorkbookFactory.create(fis);
		
		Workbook workbook=WorkbookFactory.create(new FileInputStream(new File("./resources/data.xls")));
		String Username=workbook.getSheet("data").getRow(0).getCell(0).getStringCellValue();
		String pass=workbook.getSheet("data").getRow(1).getCell(0).getStringCellValue();
		
		//Test Step 1: Launch the browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		WebDriverWait explicit=new WebDriverWait(driver,Duration.ofMillis(2000));
		System.out.println("Browser launched successfully");
		
		// Test Step 2: Enter URL
		String url="https://trello.com/en/login";
		driver.get(url);
		if(driver.getCurrentUrl().equals(url)) {
			System.out.println("Login page is displayed");
		}else {
			System.out.println("Login pge is not displayed");
		}
		
		
			
		//Test step 3: Enter Username 
				
		WebElement login=driver.findElement(By.xpath("//input[@id='user']"));
		login.clear();
		login.sendKeys(Username);
		String unentered=login.getAttribute("value");
		if(unentered.equals(Username)) {
			System.out.println("Username accepted");
		}else {
			System.out.println("not accepted");
		}
				
		//Test step 4 : Click on continue
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		
		
		//Test Step 4: Enter password
		explicit.until(ExpectedConditions.elementToBeClickable(By.id("login-submit")));
		WebElement password=driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys(pass);
		String enteredpass=password.getAttribute("value");
		if(enteredpass.equals(pass)) {
			System.out.println("Password textfield accepted");
		}
		else {
			System.out.println("password not accepted");
		}
		
		
		//Test step 5: Homepage is displayed
		driver.findElement(By.xpath("//button[@id='login-submit']")).click();
		String homepagetitile="Boards | Trello";
		Thread.sleep(6000);
		String title=driver.getTitle();
		System.out.println(title);
		if(homepagetitile.equals(title)) {
			System.out.println("Homepage is displayed");
		}
		else {
			System.out.println("Home page is not displayed");
		}
		
		
		

		
		
		
		
	}

}
