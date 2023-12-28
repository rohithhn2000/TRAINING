package Dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class creatingxlfile extends normalstringurls {
@DataProvider
public String[] xl() throws IOException{
	
	FileInputStream fis=new FileInputStream("./data1.xls");
	Workbook workbook=WorkbookFactory.create(fis);
	int count=workbook.getSheet("Sheet1").getRow(0).getPhysicalNumberOfCells();
	String []arr= new String [count];
	for(int i=0;i<count;i++) {
		arr[i]=workbook.getSheet("Sheet1").getRow(0).getCell(i).toString();
	}
	return arr;
}
	@Test (dataProvider = "xl") 
	public void test1(String arr1) throws InterruptedException  {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		driver.get("https://www.oneplus.in/");
		driver.findElement(By.xpath("//a[@class='search-icon']")).click();
		driver.findElement(By.xpath("//input[@placeholder='OnePlus 11']")).sendKeys(arr1);
		Thread.sleep(3000);
		driver.quit();
		
	}
} 

