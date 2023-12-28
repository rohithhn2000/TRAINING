package Tasks;

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

public class Trelloautomationlogin {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File abspath=new File("./resources/data.xls");
		FileInputStream fis=new FileInputStream(abspath);
		Workbook workbook=WorkbookFactory.create(fis);
		String Username=workbook.getSheet("Sheet3").getRow(1).getCell(5).getStringCellValue();
		String pass=workbook.getSheet("sheet3").getRow(1).getCell(5).getStringCellValue();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebDriverWait explicit=new WebDriverWait(driver,Duration.ofMillis(2000));
		driver.get("https://trello.com/en/login");
		WebElement login=driver.findElement(By.xpath("//input[@id='user']"));
		login.sendKeys(Username);
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		explicit.until(ExpectedConditions.elementToBeClickable(By.id("login-submit")));
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@id='login-submit']")).click();
		driver.quit();

		
		
		
		
	}

}
