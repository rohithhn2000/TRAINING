package Tasks;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Reddifftask {
	
		public static void main(String[] args) throws IOException {
			//System.setProperty("webdriver.chrome.driver", "./Drivers/.chromedriver.exe");
			ChromeDriver  driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			driver.findElement(By.xpath("//input[@id=\"login1\"]")).sendKeys("sumanthElfBatch@rediffmail.com");
			driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Testing@123");
			driver.findElement(By.xpath("//input[@value=\"Sign in\"]")).click();
			driver.findElement(By.linkText("Write mail")).click();
			driver.findElement(By.id("TO_IDcmp2")).sendKeys("sumanthElfBatch@rediffmail.com");
			//driver.findElement(By.xpath("//label[text()='Subject:']")).sendKeys("RohithHN");
			WebElement textarea =driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, rdMailEditorcmp2']"));
			driver.switchTo().frame(textarea);
			driver.findElement(By.tagName("body")).sendKeys("Hii");
			driver.switchTo().parentFrame();
			driver.findElement(By.xpath("//a[@class='send_ng_compo rd_btn_cmp_send']")).click();
			
			File send=driver.findElement(By.xpath("//div[@id='rdNotify']")).getScreenshotAs(OutputType.FILE);
			File  saved=new File("./Screenshots/sending.png");
			FileHandler.copy(send, saved);
			driver.findElement(By.xpath("(//span[text()='rohith'])[1]/..//cite[@title='Select mail']")).click();
			driver.findElement(By.xpath("(//span[text()='Delete'])[1]")).click();
			
			
			
			
			
					
		}

	}




