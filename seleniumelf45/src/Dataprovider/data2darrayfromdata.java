package Dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data2darrayfromdata {
	@DataProvider(parallel = true)
	public String[][] Demo() throws EncryptedDocumentException, IOException{
		FileInputStream fis=new FileInputStream(new File("./resources/data.xls"));
		Workbook workbook= WorkbookFactory.create(fis);
		int rows=workbook.getSheet("Sheet1").getPhysicalNumberOfRows();
		int cells=workbook.getSheet("Sheet1").getRow(0).getPhysicalNumberOfCells();
		String [][]arr= new String[rows][cells];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cells;j++) {
			arr[i][j]=workbook.getSheet("Sheet1").getRow(i).getCell(j).toString();
			}
	};
	return arr;
	}
	@Test(dataProvider = "Demo", dataProviderClass = Dataprovider.data2darrayfromdata.class)
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
