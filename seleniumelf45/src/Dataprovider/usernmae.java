package Dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class usernmae {
@DataProvider
public String[] passTestDtaa() throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream(new File("./resources/data.xls"));
	Workbook workbook=WorkbookFactory.create(fis);
	int colcount=workbook.getSheet("Sheet1").getRow(0).getPhysicalNumberOfCells()-1;
	String [] data=new String [colcount];
	for(int i=0;i<colcount;i++) {
		data[i]=workbook.getSheet("Sheet1").getRow(0).getCell(i+1).toString();
		
	}
	return data;
}
@Test(dataProvider = "passTestDtaa")
public void test(String data) {
	//System.setProperty("webdriver.chrome.driver", "./Drivers.chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys(data);
	}

}
